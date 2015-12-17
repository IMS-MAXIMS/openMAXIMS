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
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class AppointmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.AppointmentVo copy(ims.dtomove.vo.AppointmentVo valueObjectDest, ims.dtomove.vo.AppointmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Appointment(valueObjectSrc.getID_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pkey
		valueObjectDest.setPkey(valueObjectSrc.getPkey());
		// patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// numCancelled
		valueObjectDest.setNumCancelled(valueObjectSrc.getNumCancelled());
		// numDNA
		valueObjectDest.setNumDNA(valueObjectSrc.getNumDNA());
		// bookingSysType
		valueObjectDest.setBookingSysType(valueObjectSrc.getBookingSysType());
		// relatedAppointment
		valueObjectDest.setRelatedAppointment(valueObjectSrc.getRelatedAppointment());
		// patientLetter
		valueObjectDest.setPatientLetter(valueObjectSrc.getPatientLetter());
		// gpLetter
		valueObjectDest.setGpLetter(valueObjectSrc.getGpLetter());
		// comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// hcpBooking
		valueObjectDest.setHcpBooking(valueObjectSrc.getHcpBooking());
		// dateBooked
		valueObjectDest.setDateBooked(valueObjectSrc.getDateBooked());
		// priorDateOffered
		valueObjectDest.setPriorDateOffered(valueObjectSrc.getPriorDateOffered());
		// headStatus
		valueObjectDest.setHeadStatus(valueObjectSrc.getHeadStatus());
		// TransportRequired
		valueObjectDest.setTransportRequired(valueObjectSrc.getTransportRequired());
		// TransportComment
		valueObjectDest.setTransportComment(valueObjectSrc.getTransportComment());
		// patStat
		valueObjectDest.setPatStat(valueObjectSrc.getPatStat());
		// episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// apptDetail
		valueObjectDest.setApptDetail(valueObjectSrc.getApptDetail());
		// TreatPlanActionId
		valueObjectDest.setTreatPlanActionId(valueObjectSrc.getTreatPlanActionId());
		// firstApptId
		valueObjectDest.setFirstApptId(valueObjectSrc.getFirstApptId());
		// lastApptId
		valueObjectDest.setLastApptId(valueObjectSrc.getLastApptId());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppointmentVoCollectionFromAppointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Appointment objects.
	 */
	public static ims.dtomove.vo.AppointmentVoCollection createAppointmentVoCollectionFromAppointment(java.util.Set domainObjectSet)	
	{
		return createAppointmentVoCollectionFromAppointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Appointment objects.
	 */
	public static ims.dtomove.vo.AppointmentVoCollection createAppointmentVoCollectionFromAppointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.AppointmentVoCollection voList = new ims.dtomove.vo.AppointmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Appointment domainObject = (ims.dto_move.domain.objects.Appointment) iterator.next();
			ims.dtomove.vo.AppointmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Appointment objects.
	 */
	public static ims.dtomove.vo.AppointmentVoCollection createAppointmentVoCollectionFromAppointment(java.util.List domainObjectList) 
	{
		return createAppointmentVoCollectionFromAppointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Appointment objects.
	 */
	public static ims.dtomove.vo.AppointmentVoCollection createAppointmentVoCollectionFromAppointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.AppointmentVoCollection voList = new ims.dtomove.vo.AppointmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Appointment domainObject = (ims.dto_move.domain.objects.Appointment) domainObjectList.get(i);
			ims.dtomove.vo.AppointmentVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Appointment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVoCollection voCollection) 
	 {
	 	return extractAppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.AppointmentVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Appointment domainObject = AppointmentVoAssembler.extractAppointment(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Appointment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVoCollection voCollection) 
	 {
	 	return extractAppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.AppointmentVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Appointment domainObject = AppointmentVoAssembler.extractAppointment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Appointment object.
	 * @param domainObject ims.dto_move.domain.objects.Appointment
	 */
	 public static ims.dtomove.vo.AppointmentVo create(ims.dto_move.domain.objects.Appointment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Appointment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.AppointmentVo create(DomainObjectMap map, ims.dto_move.domain.objects.Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.AppointmentVo valueObject = (ims.dtomove.vo.AppointmentVo) map.getValueObject(domainObject, ims.dtomove.vo.AppointmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.AppointmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Appointment
	 */
	 public static ims.dtomove.vo.AppointmentVo insert(ims.dtomove.vo.AppointmentVo valueObject, ims.dto_move.domain.objects.Appointment domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Appointment
	 */
	 public static ims.dtomove.vo.AppointmentVo insert(DomainObjectMap map, ims.dtomove.vo.AppointmentVo valueObject, ims.dto_move.domain.objects.Appointment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Appointment(domainObject.getId());
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
		// numCancelled
		valueObject.setNumCancelled(domainObject.getNumCancelled());
		// numDNA
		valueObject.setNumDNA(domainObject.getNumDNA());
		// bookingSysType
		valueObject.setBookingSysType(domainObject.getBookingSysType());
		// relatedAppointment
		if (domainObject.getRelatedAppointment() != null)
		{
			if(domainObject.getRelatedAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRelatedAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRelatedAppointment(new ims.dto_move.vo.AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setRelatedAppointment(new ims.dto_move.vo.AppointmentRefVo(domainObject.getRelatedAppointment().getId(), domainObject.getRelatedAppointment().getVersion()));
			}
		}
		// patientLetter
		valueObject.setPatientLetter(domainObject.getPatientLetter());
		// gpLetter
		valueObject.setGpLetter(domainObject.getGpLetter());
		// comments
		valueObject.setComments(domainObject.getComments());
		// hcpBooking
		if (domainObject.getHcpBooking() != null)
		{
			if(domainObject.getHcpBooking() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHcpBooking();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHcpBooking(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setHcpBooking(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getHcpBooking().getId(), domainObject.getHcpBooking().getVersion()));
			}
		}
		// dateBooked
		java.util.Date dateBooked = domainObject.getDateBooked();
		if ( null != dateBooked ) 
		{
			valueObject.setDateBooked(new ims.framework.utils.Date(dateBooked) );
		}
		// priorDateOffered
		java.util.Date priorDateOffered = domainObject.getPriorDateOffered();
		if ( null != priorDateOffered ) 
		{
			valueObject.setPriorDateOffered(new ims.framework.utils.Date(priorDateOffered) );
		}
		// headStatus
		valueObject.setHeadStatus(domainObject.getHeadStatus());
		// TransportRequired
		valueObject.setTransportRequired(domainObject.getTransportRequired());
		// TransportComment
		valueObject.setTransportComment(domainObject.getTransportComment());
		// patStat
		valueObject.setPatStat(domainObject.getPatStat());
		// episode
		valueObject.setEpisode(domainObject.getEpisode());
		// apptDetail
		ims.dto_move.vo.AppointmentDetailRefVoCollection apptDetail = new ims.dto_move.vo.AppointmentDetailRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getApptDetail().iterator(); iterator.hasNext(); ) 
		{
			ims.dto_move.domain.objects.AppointmentDetail tmp = (ims.dto_move.domain.objects.AppointmentDetail)iterator.next();
			if (tmp != null)
				apptDetail.add(new ims.dto_move.vo.AppointmentDetailRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setApptDetail(apptDetail);
		// TreatPlanActionId
		valueObject.setTreatPlanActionId(domainObject.getTreatPlanActionId());
		// firstApptId
		valueObject.setFirstApptId(domainObject.getFirstApptId());
		// lastApptId
		valueObject.setLastApptId(domainObject.getLastApptId());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Appointment extractAppointment(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVo valueObject) 
	{
		return 	extractAppointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Appointment extractAppointment(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.AppointmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Appointment();
		ims.dto_move.domain.objects.Appointment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Appointment)domMap.get(valueObject);
			}
			// ims.dtomove.vo.AppointmentVo ID_Appointment field is unknown
			domainObject = new ims.dto_move.domain.objects.Appointment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Appointment());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Appointment)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Appointment) domainFactory.getDomainObject(ims.dto_move.domain.objects.Appointment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Appointment());

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
		domainObject.setNumCancelled(valueObject.getNumCancelled());
		domainObject.setNumDNA(valueObject.getNumDNA());
		domainObject.setBookingSysType(valueObject.getBookingSysType());
		ims.dto_move.domain.objects.Appointment value6 = null;
		if ( null != valueObject.getRelatedAppointment() ) 
		{
			if (valueObject.getRelatedAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getRelatedAppointment()) != null)
				{
					value6 = (ims.dto_move.domain.objects.Appointment)domMap.get(valueObject.getRelatedAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getRelatedAppointment();	
			}
			else
			{
				value6 = (ims.dto_move.domain.objects.Appointment)domainFactory.getDomainObject(ims.dto_move.domain.objects.Appointment.class, valueObject.getRelatedAppointment().getBoId());
			}
		}
		domainObject.setRelatedAppointment(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatientLetter() != null && valueObject.getPatientLetter().equals(""))
		{
			valueObject.setPatientLetter(null);
		}
		domainObject.setPatientLetter(valueObject.getPatientLetter());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGpLetter() != null && valueObject.getGpLetter().equals(""))
		{
			valueObject.setGpLetter(null);
		}
		domainObject.setGpLetter(valueObject.getGpLetter());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.core.resource.people.domain.objects.MemberOfStaff value10 = null;
		if ( null != valueObject.getHcpBooking() ) 
		{
			if (valueObject.getHcpBooking().getBoId() == null)
			{
				if (domMap.get(valueObject.getHcpBooking()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getHcpBooking());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getHcpBooking();	
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getHcpBooking().getBoId());
			}
		}
		domainObject.setHcpBooking(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getDateBooked();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setDateBooked(value11);
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getPriorDateOffered();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setPriorDateOffered(value12);
		domainObject.setHeadStatus(valueObject.getHeadStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransportRequired() != null && valueObject.getTransportRequired().equals(""))
		{
			valueObject.setTransportRequired(null);
		}
		domainObject.setTransportRequired(valueObject.getTransportRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTransportComment() != null && valueObject.getTransportComment().equals(""))
		{
			valueObject.setTransportComment(null);
		}
		domainObject.setTransportComment(valueObject.getTransportComment());
		domainObject.setPatStat(valueObject.getPatStat());
		domainObject.setEpisode(valueObject.getEpisode());

		ims.dto_move.vo.AppointmentDetailRefVoCollection refCollection18 = valueObject.getApptDetail();
		int size18 = (null == refCollection18) ? 0 : refCollection18.size();		
		java.util.List domainApptDetail18 = domainObject.getApptDetail();
		if (domainApptDetail18 == null)
		{
			domainApptDetail18 = new java.util.ArrayList();
		}
		for(int i=0; i < size18; i++) 
		{
			ims.dto_move.vo.AppointmentDetailRefVo vo = refCollection18.get(i);			
			ims.dto_move.domain.objects.AppointmentDetail dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.AppointmentDetail)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.AppointmentDetail)domainFactory.getDomainObject( ims.dto_move.domain.objects.AppointmentDetail.class, vo.getBoId());
				}
			}

			int domIdx = domainApptDetail18.indexOf(dom);
			if (domIdx == -1)
			{
				domainApptDetail18.add(i, dom);
			}
			else if (i != domIdx && i < domainApptDetail18.size())
			{
				Object tmp = domainApptDetail18.get(i);
				domainApptDetail18.set(i, domainApptDetail18.get(domIdx));
				domainApptDetail18.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i18 = domainApptDetail18.size();
		while (i18 > size18)
		{
			domainApptDetail18.remove(i18-1);
			i18 = domainApptDetail18.size();
		}
		
		domainObject.setApptDetail(domainApptDetail18);		
		domainObject.setTreatPlanActionId(valueObject.getTreatPlanActionId());
		domainObject.setFirstApptId(valueObject.getFirstApptId());
		domainObject.setLastApptId(valueObject.getLastApptId());

		return domainObject;
	}

}
