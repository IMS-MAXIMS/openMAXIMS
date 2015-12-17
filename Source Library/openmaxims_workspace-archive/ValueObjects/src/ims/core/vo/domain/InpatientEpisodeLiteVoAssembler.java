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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class InpatientEpisodeLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.InpatientEpisodeLiteVo copy(ims.core.vo.InpatientEpisodeLiteVo valueObjectDest, ims.core.vo.InpatientEpisodeLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_InpatientEpisode(valueObjectSrc.getID_InpatientEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// EstDischargeDate
		valueObjectDest.setEstDischargeDate(valueObjectSrc.getEstDischargeDate());
		// isConfirmedDischarge
		valueObjectDest.setIsConfirmedDischarge(valueObjectSrc.getIsConfirmedDischarge());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// consultantStays
		valueObjectDest.setConsultantStays(valueObjectSrc.getConsultantStays());
		// ConfirmedDischargeDateTime
		valueObjectDest.setConfirmedDischargeDateTime(valueObjectSrc.getConfirmedDischargeDateTime());
		// isMaternityInpatient
		valueObjectDest.setIsMaternityInpatient(valueObjectSrc.getIsMaternityInpatient());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
		// isOnHomeLeave
		valueObjectDest.setIsOnHomeLeave(valueObjectSrc.getIsOnHomeLeave());
		// ExpectedDateOfReturn
		valueObjectDest.setExpectedDateOfReturn(valueObjectSrc.getExpectedDateOfReturn());
		// ExpectedTimeOfReturn
		valueObjectDest.setExpectedTimeOfReturn(valueObjectSrc.getExpectedTimeOfReturn());
		// VacatedBedNumber
		valueObjectDest.setVacatedBedNumber(valueObjectSrc.getVacatedBedNumber());
		// DateOnHomeLeave
		valueObjectDest.setDateOnHomeLeave(valueObjectSrc.getDateOnHomeLeave());
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
 	 * If more than one call to an Assembler is made then #createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeLiteVoCollection createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(java.util.Set domainObjectSet)	
	{
		return createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeLiteVoCollection createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.InpatientEpisodeLiteVoCollection voList = new ims.core.vo.InpatientEpisodeLiteVoCollection();
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
			ims.core.vo.InpatientEpisodeLiteVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.InpatientEpisodeLiteVoCollection createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(java.util.List domainObjectList) 
	{
		return createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.InpatientEpisode objects.
	 */
	public static ims.core.vo.InpatientEpisodeLiteVoCollection createInpatientEpisodeLiteVoCollectionFromInpatientEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.InpatientEpisodeLiteVoCollection voList = new ims.core.vo.InpatientEpisodeLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = (ims.core.admin.pas.domain.objects.InpatientEpisode) domainObjectList.get(i);
			ims.core.vo.InpatientEpisodeLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractInpatientEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeLiteVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVoCollection voCollection) 
	 {
	 	return extractInpatientEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractInpatientEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.InpatientEpisodeLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.InpatientEpisode domainObject = InpatientEpisodeLiteVoAssembler.extractInpatientEpisode(domainFactory, vo, domMap);

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
	 public static ims.core.vo.InpatientEpisodeLiteVo create(ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	  public static ims.core.vo.InpatientEpisodeLiteVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.InpatientEpisodeLiteVo valueObject = (ims.core.vo.InpatientEpisodeLiteVo) map.getValueObject(domainObject, ims.core.vo.InpatientEpisodeLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.InpatientEpisodeLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.InpatientEpisodeLiteVo insert(ims.core.vo.InpatientEpisodeLiteVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
	 public static ims.core.vo.InpatientEpisodeLiteVo insert(DomainObjectMap map, ims.core.vo.InpatientEpisodeLiteVo valueObject, ims.core.admin.pas.domain.objects.InpatientEpisode domainObject) 
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
		valueObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.create(map, domainObject.getPasEvent()) );
		// EstDischargeDate
		java.util.Date EstDischargeDate = domainObject.getEstDischargeDate();
		if ( null != EstDischargeDate ) 
		{
			valueObject.setEstDischargeDate(new ims.framework.utils.Date(EstDischargeDate) );
		}
		// isConfirmedDischarge
		valueObject.setIsConfirmedDischarge( domainObject.isIsConfirmedDischarge() );
		// wardStays
		ims.core.admin.pas.vo.WardStayRefVoCollection wardStays = new ims.core.admin.pas.vo.WardStayRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getWardStays().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.WardStay tmp = (ims.core.admin.pas.domain.objects.WardStay)iterator.next();
			if (tmp != null)
				wardStays.add(new ims.core.admin.pas.vo.WardStayRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setWardStays(wardStays);
		// consultantStays
		ims.core.admin.pas.vo.ConsultantStayRefVoCollection consultantStays = new ims.core.admin.pas.vo.ConsultantStayRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getConsultantStays().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.ConsultantStay tmp = (ims.core.admin.pas.domain.objects.ConsultantStay)iterator.next();
			if (tmp != null)
				consultantStays.add(new ims.core.admin.pas.vo.ConsultantStayRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setConsultantStays(consultantStays);
		// ConfirmedDischargeDateTime
		java.util.Date ConfirmedDischargeDateTime = domainObject.getConfirmedDischargeDateTime();
		if ( null != ConfirmedDischargeDateTime ) 
		{
			valueObject.setConfirmedDischargeDateTime(new ims.framework.utils.DateTime(ConfirmedDischargeDateTime) );
		}
		// isMaternityInpatient
		valueObject.setIsMaternityInpatient( domainObject.isIsMaternityInpatient() );
		// Bed
		valueObject.setBed(ims.core.vo.domain.BedSpaceStateBayOnlyVoAssembler.create(map, domainObject.getBed()) );
		// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
		// isOnHomeLeave
		valueObject.setIsOnHomeLeave( domainObject.isIsOnHomeLeave() );
		// ExpectedDateOfReturn
		java.util.Date ExpectedDateOfReturn = domainObject.getExpectedDateOfReturn();
		if ( null != ExpectedDateOfReturn ) 
		{
			valueObject.setExpectedDateOfReturn(new ims.framework.utils.Date(ExpectedDateOfReturn) );
		}
		// ExpectedTimeOfReturn
		String ExpectedTimeOfReturn = domainObject.getExpectedTimeOfReturn();
		if ( null != ExpectedTimeOfReturn ) 
		{
			valueObject.setExpectedTimeOfReturn(new ims.framework.utils.Time(ExpectedTimeOfReturn) );
		}
		// VacatedBedNumber
		valueObject.setVacatedBedNumber(domainObject.getVacatedBedNumber());
		// DateOnHomeLeave
		java.util.Date DateOnHomeLeave = domainObject.getDateOnHomeLeave();
		if ( null != DateOnHomeLeave ) 
		{
			valueObject.setDateOnHomeLeave(new ims.framework.utils.Date(DateOnHomeLeave) );
		}
		// VTEAssessmentStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getVTEAssessmentStatus();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.VTEAsessmentStatus voLookup15 = new ims.clinical.vo.lookups.VTEAsessmentStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAsessmentStatus parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.VTEAsessmentStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setVTEAssessmentStatus(voLookup15);
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
	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVo valueObject) 
	{
		return 	extractInpatientEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.InpatientEpisode extractInpatientEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.InpatientEpisodeLiteVo valueObject, HashMap domMap) 
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
			// ims.core.vo.InpatientEpisodeLiteVo ID_InpatientEpisode field is unknown
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

		domainObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getEstDischargeDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setEstDischargeDate(value2);
		domainObject.setIsConfirmedDischarge(valueObject.getIsConfirmedDischarge());

		ims.core.admin.pas.vo.WardStayRefVoCollection refCollection4 = valueObject.getWardStays();
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainWardStays4 = domainObject.getWardStays();
		if (domainWardStays4 == null)
		{
			domainWardStays4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.core.admin.pas.vo.WardStayRefVo vo = refCollection4.get(i);					
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
			if (!domainWardStays4.contains(dom))
			{
				domainWardStays4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainWardStays4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainWardStays4.remove(iter4.next());
		}		
		
		domainObject.setWardStays(domainWardStays4);		

		ims.core.admin.pas.vo.ConsultantStayRefVoCollection refCollection5 = valueObject.getConsultantStays();
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainConsultantStays5 = domainObject.getConsultantStays();
		if (domainConsultantStays5 == null)
		{
			domainConsultantStays5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.core.admin.pas.vo.ConsultantStayRefVo vo = refCollection5.get(i);					
			ims.core.admin.pas.domain.objects.ConsultantStay dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.ConsultantStay.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainConsultantStays5.contains(dom))
			{
				domainConsultantStays5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainConsultantStays5.iterator();
		//Find out which objects need to be removed
		while (iter5.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter5.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet5.contains(o))
			{
				removedSet5.add(o);
			}
		}
		iter5 = removedSet5.iterator();
		//Remove the unwanted objects
		while (iter5.hasNext())
		{
			domainConsultantStays5.remove(iter5.next());
		}		
		
		domainObject.setConsultantStays(domainConsultantStays5);		
		ims.framework.utils.DateTime dateTime6 = valueObject.getConfirmedDischargeDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setConfirmedDischargeDateTime(value6);
		domainObject.setIsMaternityInpatient(valueObject.getIsMaternityInpatient());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.pas.domain.objects.BedSpaceState value8 = null;
		if ( null != valueObject.getBed() ) 
		{
			if (valueObject.getBed().getBoId() == null)
			{
				if (domMap.get(valueObject.getBed()) != null)
				{
					value8 = (ims.core.admin.pas.domain.objects.BedSpaceState)domMap.get(valueObject.getBed());
				}
			}
			else
			{
				value8 = (ims.core.admin.pas.domain.objects.BedSpaceState)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceState.class, valueObject.getBed().getBoId());
			}
		}
		domainObject.setBed(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getDischargeReadyDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setDischargeReadyDate(value9);
		domainObject.setIsOnHomeLeave(valueObject.getIsOnHomeLeave());
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getExpectedDateOfReturn();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setExpectedDateOfReturn(value11);
		ims.framework.utils.Time time12 = valueObject.getExpectedTimeOfReturn();
		String value12 = null;
		if ( time12 != null ) 
		{
			value12 = time12.toString();
		}
		domainObject.setExpectedTimeOfReturn(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getVacatedBedNumber() != null && valueObject.getVacatedBedNumber().equals(""))
		{
			valueObject.setVacatedBedNumber(null);
		}
		domainObject.setVacatedBedNumber(valueObject.getVacatedBedNumber());
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getDateOnHomeLeave();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setDateOnHomeLeave(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value15);
		ims.core.clinical.domain.objects.VTERiskAssessment value16 = null;
		if ( null != valueObject.getVTERiskAssessment() ) 
		{
			if (valueObject.getVTERiskAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getVTERiskAssessment()) != null)
				{
					value16 = (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(valueObject.getVTERiskAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value16 = domainObject.getVTERiskAssessment();	
			}
			else
			{
				value16 = (ims.core.clinical.domain.objects.VTERiskAssessment)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VTERiskAssessment.class, valueObject.getVTERiskAssessment().getBoId());
			}
		}
		domainObject.setVTERiskAssessment(value16);

		return domainObject;
	}

}
