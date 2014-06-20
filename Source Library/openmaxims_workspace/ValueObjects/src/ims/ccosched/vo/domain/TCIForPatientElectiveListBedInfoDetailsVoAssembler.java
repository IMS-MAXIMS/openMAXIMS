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
package ims.ccosched.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class TCIForPatientElectiveListBedInfoDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo copy(ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObjectDest, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TCIForPatientElectiveList(valueObjectSrc.getID_TCIForPatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TCIDate
		valueObjectDest.setTCIDate(valueObjectSrc.getTCIDate());
		// TCITime
		valueObjectDest.setTCITime(valueObjectSrc.getTCITime());
		// TCIWard
		valueObjectDest.setTCIWard(valueObjectSrc.getTCIWard());
		// TCIBed
		valueObjectDest.setTCIBed(valueObjectSrc.getTCIBed());
		// BedManagerComment
		valueObjectDest.setBedManagerComment(valueObjectSrc.getBedManagerComment());
		// TCIConsultant
		valueObjectDest.setTCIConsultant(valueObjectSrc.getTCIConsultant());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
		// CurrentOutcome
		valueObjectDest.setCurrentOutcome(valueObjectSrc.getCurrentOutcome());
		// OutcomeHistory
		valueObjectDest.setOutcomeHistory(valueObjectSrc.getOutcomeHistory());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voList = new ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) iterator.next();
			ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(java.util.List domainObjectList) 
	{
		return createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TCIForPatientElectiveList objects.
	 */
	public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection createTCIForPatientElectiveListBedInfoDetailsVoCollectionFromTCIForPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voList = new ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainObjectList.get(i);
			ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTCIForPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListBedInfoDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.TCIForPatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voCollection) 
	 {
	 	return extractTCIForPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTCIForPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = TCIForPatientElectiveListBedInfoDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo create(ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.TCIForPatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo create(DomainObjectMap map, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObject = (ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo) map.getValueObject(domainObject, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo insert(ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.TCIForPatientElectiveList
	 */
	 public static ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo insert(DomainObjectMap map, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObject, ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TCIForPatientElectiveList(domainObject.getId());
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
			
		// TCIDate
		java.util.Date TCIDate = domainObject.getTCIDate();
		if ( null != TCIDate ) 
		{
			valueObject.setTCIDate(new ims.framework.utils.Date(TCIDate) );
		}
		// TCITime
		String TCITime = domainObject.getTCITime();
		if ( null != TCITime ) 
		{
			valueObject.setTCITime(new ims.framework.utils.Time(TCITime) );
		}
		// TCIWard
		valueObject.setTCIWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTCIWard()) );
		// TCIBed
		valueObject.setTCIBed(domainObject.getTCIBed());
		// BedManagerComment
		valueObject.setBedManagerComment(domainObject.getBedManagerComment());
		// TCIConsultant
		valueObject.setTCIConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTCIConsultant()) );
		// AdmissionDetail
		valueObject.setAdmissionDetail(ims.core.vo.domain.AdmissionDetailVoAssembler.create(map, domainObject.getAdmissionDetail()) );
		// CurrentOutcome
		valueObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.create(map, domainObject.getCurrentOutcome()) );
		// OutcomeHistory
		ims.RefMan.vo.TCIOutcomeForPatientElectiveListRefVoCollection OutcomeHistory = new ims.RefMan.vo.TCIOutcomeForPatientElectiveListRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getOutcomeHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList tmp = (ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList)iterator.next();
			if (tmp != null)
				OutcomeHistory.add(new ims.RefMan.vo.TCIOutcomeForPatientElectiveListRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setOutcomeHistory(OutcomeHistory);
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler.create(map, domainObject.getAppointment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObject) 
	{
		return 	extractTCIForPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TCIForPatientElectiveList extractTCIForPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TCIForPatientElectiveList();
		ims.RefMan.domain.objects.TCIForPatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(valueObject);
			}
			// ims.ccosched.vo.TCIForPatientElectiveListBedInfoDetailsVo ID_TCIForPatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.TCIForPatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TCIForPatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.TCIForPatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.TCIForPatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.TCIForPatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TCIForPatientElectiveList());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getTCIDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setTCIDate(value1);
		ims.framework.utils.Time time2 = valueObject.getTCITime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setTCITime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getTCIWard() ) 
		{
			if (valueObject.getTCIWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTCIWard());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTCIWard().getBoId());
			}
		}
		domainObject.setTCIWard(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTCIBed() != null && valueObject.getTCIBed().equals(""))
		{
			valueObject.setTCIBed(null);
		}
		domainObject.setTCIBed(valueObject.getTCIBed());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBedManagerComment() != null && valueObject.getBedManagerComment().equals(""))
		{
			valueObject.setBedManagerComment(null);
		}
		domainObject.setBedManagerComment(valueObject.getBedManagerComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getTCIConsultant() ) 
		{
			if (valueObject.getTCIConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTCIConsultant()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTCIConsultant());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTCIConsultant().getBoId());
			}
		}
		domainObject.setTCIConsultant(value6);
		domainObject.setAdmissionDetail(ims.core.vo.domain.AdmissionDetailVoAssembler.extractAdmissionDetail(domainFactory, valueObject.getAdmissionDetail(), domMap));
		domainObject.setCurrentOutcome(ims.RefMan.vo.domain.TCIOutcomeForPatientElectiveListVoAssembler.extractTCIOutcomeForPatientElectiveList(domainFactory, valueObject.getCurrentOutcome(), domMap));

		ims.RefMan.vo.TCIOutcomeForPatientElectiveListRefVoCollection refCollection9 = valueObject.getOutcomeHistory();
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainOutcomeHistory9 = domainObject.getOutcomeHistory();
		if (domainOutcomeHistory9 == null)
		{
			domainOutcomeHistory9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.RefMan.vo.TCIOutcomeForPatientElectiveListRefVo vo = refCollection9.get(i);			
			ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList)domainFactory.getDomainObject( ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList.class, vo.getBoId());
				}
			}

			int domIdx = domainOutcomeHistory9.indexOf(dom);
			if (domIdx == -1)
			{
				domainOutcomeHistory9.add(i, dom);
			}
			else if (i != domIdx && i < domainOutcomeHistory9.size())
			{
				Object tmp = domainOutcomeHistory9.get(i);
				domainOutcomeHistory9.set(i, domainOutcomeHistory9.get(domIdx));
				domainOutcomeHistory9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainOutcomeHistory9.size();
		while (i9 > size9)
		{
			domainOutcomeHistory9.remove(i9-1);
			i9 = domainOutcomeHistory9.size();
		}
		
		domainObject.setOutcomeHistory(domainOutcomeHistory9);		
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler.extractBooking_Appointment(domainFactory, valueObject.getAppointment(), domMap));

		return domainObject;
	}

}
