//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PatientChartableOccurenceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientChartableOccurenceVo copy(ims.clinical.vo.PatientChartableOccurenceVo valueObjectDest, ims.clinical.vo.PatientChartableOccurenceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientChartableOccurance(valueObjectSrc.getID_PatientChartableOccurance());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// TimeObserved
		valueObjectDest.setTimeObserved(valueObjectSrc.getTimeObserved());
		// ChartableOccuranceType
		valueObjectDest.setChartableOccuranceType(valueObjectSrc.getChartableOccuranceType());
		// ReportedBy
		valueObjectDest.setReportedBy(valueObjectSrc.getReportedBy());
		// IncidentNumber
		valueObjectDest.setIncidentNumber(valueObjectSrc.getIncidentNumber());
		// PeriOpStage
		valueObjectDest.setPeriOpStage(valueObjectSrc.getPeriOpStage());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientChartableOccurance objects.
	 */
	public static ims.clinical.vo.PatientChartableOccurenceVoCollection createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(java.util.Set domainObjectSet)	
	{
		return createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientChartableOccurance objects.
	 */
	public static ims.clinical.vo.PatientChartableOccurenceVoCollection createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientChartableOccurenceVoCollection voList = new ims.clinical.vo.PatientChartableOccurenceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientChartableOccurance domainObject = (ims.clinical.domain.objects.PatientChartableOccurance) iterator.next();
			ims.clinical.vo.PatientChartableOccurenceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientChartableOccurance objects.
	 */
	public static ims.clinical.vo.PatientChartableOccurenceVoCollection createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(java.util.List domainObjectList) 
	{
		return createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientChartableOccurance objects.
	 */
	public static ims.clinical.vo.PatientChartableOccurenceVoCollection createPatientChartableOccurenceVoCollectionFromPatientChartableOccurance(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientChartableOccurenceVoCollection voList = new ims.clinical.vo.PatientChartableOccurenceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientChartableOccurance domainObject = (ims.clinical.domain.objects.PatientChartableOccurance) domainObjectList.get(i);
			ims.clinical.vo.PatientChartableOccurenceVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientChartableOccurance set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientChartableOccuranceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVoCollection voCollection) 
	 {
	 	return extractPatientChartableOccuranceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientChartableOccuranceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientChartableOccurenceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientChartableOccurance domainObject = PatientChartableOccurenceVoAssembler.extractPatientChartableOccurance(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientChartableOccurance list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientChartableOccuranceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVoCollection voCollection) 
	 {
	 	return extractPatientChartableOccuranceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientChartableOccuranceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientChartableOccurenceVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientChartableOccurance domainObject = PatientChartableOccurenceVoAssembler.extractPatientChartableOccurance(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientChartableOccurance object.
	 * @param domainObject ims.clinical.domain.objects.PatientChartableOccurance
	 */
	 public static ims.clinical.vo.PatientChartableOccurenceVo create(ims.clinical.domain.objects.PatientChartableOccurance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientChartableOccurance object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientChartableOccurenceVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientChartableOccurance domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientChartableOccurenceVo valueObject = (ims.clinical.vo.PatientChartableOccurenceVo) map.getValueObject(domainObject, ims.clinical.vo.PatientChartableOccurenceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientChartableOccurenceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientChartableOccurance
	 */
	 public static ims.clinical.vo.PatientChartableOccurenceVo insert(ims.clinical.vo.PatientChartableOccurenceVo valueObject, ims.clinical.domain.objects.PatientChartableOccurance domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientChartableOccurance
	 */
	 public static ims.clinical.vo.PatientChartableOccurenceVo insert(DomainObjectMap map, ims.clinical.vo.PatientChartableOccurenceVo valueObject, ims.clinical.domain.objects.PatientChartableOccurance domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientChartableOccurance(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// TimeObserved
		java.util.Date TimeObserved = domainObject.getTimeObserved();
		if ( null != TimeObserved ) 
		{
			valueObject.setTimeObserved(new ims.framework.utils.DateTime(TimeObserved) );
		}
		// ChartableOccuranceType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getChartableOccuranceType();
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

			ims.clinical.vo.lookups.ChartableOccuranceType voLookup3 = new ims.clinical.vo.lookups.ChartableOccuranceType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.ChartableOccuranceType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.ChartableOccuranceType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setChartableOccuranceType(voLookup3);
		}
				// ReportedBy
		valueObject.setReportedBy((ims.core.vo.MemberOfStaffLiteVo)ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getReportedBy()) );
		// IncidentNumber
		valueObject.setIncidentNumber(domainObject.getIncidentNumber());
		// PeriOpStage
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPeriOpStage();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.PeriOpStage voLookup6 = new ims.clinical.vo.lookups.PeriOpStage(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.clinical.vo.lookups.PeriOpStage parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.clinical.vo.lookups.PeriOpStage(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPeriOpStage(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientChartableOccurance extractPatientChartableOccurance(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVo valueObject) 
	{
		return 	extractPatientChartableOccurance(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientChartableOccurance extractPatientChartableOccurance(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientChartableOccurenceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientChartableOccurance();
		ims.clinical.domain.objects.PatientChartableOccurance domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientChartableOccurance)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientChartableOccurenceVo ID_PatientChartableOccurance field is unknown
			domainObject = new ims.clinical.domain.objects.PatientChartableOccurance();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientChartableOccurance());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientChartableOccurance)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientChartableOccurance) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientChartableOccurance.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientChartableOccurance());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getTimeObserved();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setTimeObserved(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getChartableOccuranceType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getChartableOccuranceType().getID());
		}
		domainObject.setChartableOccuranceType(value3);
		domainObject.setReportedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, (ims.core.vo.MemberOfStaffLiteVo)valueObject.getReportedBy(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getIncidentNumber() != null && valueObject.getIncidentNumber().equals(""))
		{
			valueObject.setIncidentNumber(null);
		}
		domainObject.setIncidentNumber(valueObject.getIncidentNumber());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPeriOpStage() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPeriOpStage().getID());
		}
		domainObject.setPeriOpStage(value6);

		return domainObject;
	}

}
