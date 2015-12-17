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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ReferralAppointmentDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralAppointmentDetailsVo copy(ims.RefMan.vo.ReferralAppointmentDetailsVo valueObjectDest, ims.RefMan.vo.ReferralAppointmentDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// InvestigationOrders
		valueObjectDest.setInvestigationOrders(valueObjectSrc.getInvestigationOrders());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// OrderInvAppts
		valueObjectDest.setOrderInvAppts(valueObjectSrc.getOrderInvAppts());
		// ICABReferral
		valueObjectDest.setICABReferral(valueObjectSrc.getICABReferral());
		// OutpatientEROD
		valueObjectDest.setOutpatientEROD(valueObjectSrc.getOutpatientEROD());
		// ElectiveEROD
		valueObjectDest.setElectiveEROD(valueObjectSrc.getElectiveEROD());
		// CurrentRTTStatus
		valueObjectDest.setCurrentRTTStatus(valueObjectSrc.getCurrentRTTStatus());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// current31TargetDate
		valueObjectDest.setCurrent31TargetDate(valueObjectSrc.getCurrent31TargetDate());
		// current62TargetDate
		valueObjectDest.setCurrent62TargetDate(valueObjectSrc.getCurrent62TargetDate());
		// ConsultationActivityRequired
		valueObjectDest.setConsultationActivityRequired(valueObjectSrc.getConsultationActivityRequired());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// IsEmergencyReferral
		valueObjectDest.setIsEmergencyReferral(valueObjectSrc.getIsEmergencyReferral());
		// TriageOutcome
		valueObjectDest.setTriageOutcome(valueObjectSrc.getTriageOutcome());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralAppointmentDetailsVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.ReferralAppointmentDetailsVoCollection createReferralAppointmentDetailsVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createReferralAppointmentDetailsVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.ReferralAppointmentDetailsVoCollection createReferralAppointmentDetailsVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voList = new ims.RefMan.vo.ReferralAppointmentDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) iterator.next();
			ims.RefMan.vo.ReferralAppointmentDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.ReferralAppointmentDetailsVoCollection createReferralAppointmentDetailsVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createReferralAppointmentDetailsVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.ReferralAppointmentDetailsVoCollection createReferralAppointmentDetailsVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voList = new ims.RefMan.vo.ReferralAppointmentDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.ReferralAppointmentDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralAppointmentDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = ReferralAppointmentDetailsVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralAppointmentDetailsVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = ReferralAppointmentDetailsVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.ReferralAppointmentDetailsVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReferralAppointmentDetailsVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralAppointmentDetailsVo valueObject = (ims.RefMan.vo.ReferralAppointmentDetailsVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralAppointmentDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralAppointmentDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.ReferralAppointmentDetailsVo insert(ims.RefMan.vo.ReferralAppointmentDetailsVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.ReferralAppointmentDetailsVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralAppointmentDetailsVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CatsReferral(domainObject.getId());
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
			
		// ReferralDetails
		valueObject.setReferralDetails(ims.RefMan.vo.domain.ReferralLetterDetailsLiteWithGPVoAssembler.create(map, domainObject.getReferralDetails()) );
		// InvestigationOrders
		valueObject.setInvestigationOrders(ims.ocrr.vo.domain.ReferralAppointmentDetailsOcsOrderVoAssembler.createReferralAppointmentDetailsOcsOrderVoCollectionFromOcsOrderSession(map, domainObject.getInvestigationOrders()) );
		// Appointments
		valueObject.setAppointments(ims.scheduling.vo.domain.ReferralAppointmentDetailsBookingAppointmentVoAssembler.createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// OrderInvAppts
		valueObject.setOrderInvAppts(ims.RefMan.vo.domain.OrderInvApptListVoAssembler.createOrderInvApptListVoCollectionFromOrderInvAppt(map, domainObject.getOrderInvAppts()) );
		// ICABReferral
		valueObject.setICABReferral(ims.admin.vo.domain.ICABReferralListVoAssembler.create(map, domainObject.getICABReferral()) );
		// OutpatientEROD
		valueObject.setOutpatientEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.createReferralERODVoCollectionFromReferralEROD(map, domainObject.getOutpatientEROD()) );
		// ElectiveEROD
		valueObject.setElectiveEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.createReferralERODVoCollectionFromReferralEROD(map, domainObject.getElectiveEROD()) );
		// CurrentRTTStatus
		valueObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTCurrentStatusVoAssembler.create(map, domainObject.getCurrentRTTStatus()) );
		// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// Urgency
		ims.domain.lookups.LookupInstance instance13 = domainObject.getUrgency();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ReferralUrgency voLookup13 = new ims.RefMan.vo.lookups.ReferralUrgency(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setUrgency(voLookup13);
		}
				// current31TargetDate
		java.util.Date current31TargetDate = domainObject.getCurrent31TargetDate();
		if ( null != current31TargetDate ) 
		{
			valueObject.setCurrent31TargetDate(new ims.framework.utils.Date(current31TargetDate) );
		}
		// current62TargetDate
		java.util.Date current62TargetDate = domainObject.getCurrent62TargetDate();
		if ( null != current62TargetDate ) 
		{
			valueObject.setCurrent62TargetDate(new ims.framework.utils.Date(current62TargetDate) );
		}
		// ConsultationActivityRequired
		valueObject.setConsultationActivityRequired( domainObject.isConsultationActivityRequired() );
		// Contract
		if (domainObject.getContract() != null)
		{
			if(domainObject.getContract() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getContract();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setContract(new ims.core.configuration.vo.ContractConfigRefVo(id, -1));				
			}
			else
			{
				valueObject.setContract(new ims.core.configuration.vo.ContractConfigRefVo(domainObject.getContract().getId(), domainObject.getContract().getVersion()));
			}
		}
		// IsEmergencyReferral
		valueObject.setIsEmergencyReferral( domainObject.isIsEmergencyReferral() );
		// TriageOutcome
		valueObject.setTriageOutcome(ims.RefMan.vo.domain.TriageOutcomeLiteVoAssembler.create(map, domainObject.getTriageOutcome()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralAppointmentDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CatsReferral();
		ims.RefMan.domain.objects.CatsReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReferralAppointmentDetailsVo ID_CatsReferral field is unknown
			domainObject = new ims.RefMan.domain.objects.CatsReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CatsReferral());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.CatsReferral) domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CatsReferral());

		domainObject.setReferralDetails(ims.RefMan.vo.domain.ReferralLetterDetailsLiteWithGPVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
		domainObject.setInvestigationOrders(ims.ocrr.vo.domain.ReferralAppointmentDetailsOcsOrderVoAssembler.extractOcsOrderSessionSet(domainFactory, valueObject.getInvestigationOrders(), domainObject.getInvestigationOrders(), domMap));		
		domainObject.setAppointments(ims.scheduling.vo.domain.ReferralAppointmentDetailsBookingAppointmentVoAssembler.extractBooking_AppointmentSet(domainFactory, valueObject.getAppointments(), domainObject.getAppointments(), domMap));		
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setOrderInvAppts(ims.RefMan.vo.domain.OrderInvApptListVoAssembler.extractOrderInvApptSet(domainFactory, valueObject.getOrderInvAppts(), domainObject.getOrderInvAppts(), domMap));		
		domainObject.setICABReferral(ims.admin.vo.domain.ICABReferralListVoAssembler.extractICABReferral(domainFactory, valueObject.getICABReferral(), domMap));

		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.ReferralERODRefVoCollection refCollection8 = new ims.RefMan.vo.ReferralERODRefVoCollection();
		if (valueObject.getOutpatientEROD() != null)
		{
			for (int i8=0; i8<valueObject.getOutpatientEROD().size(); i8++)
			{
				ims.RefMan.vo.ReferralERODRefVo ref8 = (ims.RefMan.vo.ReferralERODRefVo)valueObject.getOutpatientEROD().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.List domainOutpatientEROD8 = domainObject.getOutpatientEROD();
		if (domainOutpatientEROD8 == null)
		{
			domainOutpatientEROD8 = new java.util.ArrayList();
		}
		for(int i=0; i < size8; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection8.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainOutpatientEROD8.indexOf(dom);
			if (domIdx == -1)
			{
				domainOutpatientEROD8.add(i, dom);
			}
			else if (i != domIdx && i < domainOutpatientEROD8.size())
			{
				Object tmp = domainOutpatientEROD8.get(i);
				domainOutpatientEROD8.set(i, domainOutpatientEROD8.get(domIdx));
				domainOutpatientEROD8.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i8 = domainOutpatientEROD8.size();
		while (i8 > size8)
		{
			domainOutpatientEROD8.remove(i8-1);
			i8 = domainOutpatientEROD8.size();
		}
		
		domainObject.setOutpatientEROD(domainOutpatientEROD8);		

		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.ReferralERODRefVoCollection refCollection9 = new ims.RefMan.vo.ReferralERODRefVoCollection();
		if (valueObject.getElectiveEROD() != null)
		{
			for (int i9=0; i9<valueObject.getElectiveEROD().size(); i9++)
			{
				ims.RefMan.vo.ReferralERODRefVo ref9 = (ims.RefMan.vo.ReferralERODRefVo)valueObject.getElectiveEROD().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainElectiveEROD9 = domainObject.getElectiveEROD();
		if (domainElectiveEROD9 == null)
		{
			domainElectiveEROD9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection9.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainElectiveEROD9.indexOf(dom);
			if (domIdx == -1)
			{
				domainElectiveEROD9.add(i, dom);
			}
			else if (i != domIdx && i < domainElectiveEROD9.size())
			{
				Object tmp = domainElectiveEROD9.get(i);
				domainElectiveEROD9.set(i, domainElectiveEROD9.get(domIdx));
				domainElectiveEROD9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainElectiveEROD9.size();
		while (i9 > size9)
		{
			domainElectiveEROD9.remove(i9-1);
			i9 = domainElectiveEROD9.size();
		}
		
		domainObject.setElectiveEROD(domainElectiveEROD9);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.domain.objects.PathwayRTTStatus value10 = null;
		if ( null != valueObject.getCurrentRTTStatus() ) 
		{
			if (valueObject.getCurrentRTTStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentRTTStatus()) != null)
				{
					value10 = (ims.pathways.domain.objects.PathwayRTTStatus)domMap.get(valueObject.getCurrentRTTStatus());
				}
			}
			else
			{
				value10 = (ims.pathways.domain.objects.PathwayRTTStatus)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayRTTStatus.class, valueObject.getCurrentRTTStatus().getBoId());
			}
		}
		domainObject.setCurrentRTTStatus(value10);
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value13);
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getCurrent31TargetDate();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setCurrent31TargetDate(value14);
		java.util.Date value15 = null;
		ims.framework.utils.Date date15 = valueObject.getCurrent62TargetDate();		
		if ( date15 != null ) 
		{
			value15 = date15.getDate();
		}
		domainObject.setCurrent62TargetDate(value15);
		domainObject.setConsultationActivityRequired(valueObject.getConsultationActivityRequired());
		ims.core.configuration.domain.objects.ContractConfig value17 = null;
		if ( null != valueObject.getContract() ) 
		{
			if (valueObject.getContract().getBoId() == null)
			{
				if (domMap.get(valueObject.getContract()) != null)
				{
					value17 = (ims.core.configuration.domain.objects.ContractConfig)domMap.get(valueObject.getContract());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getContract();	
			}
			else
			{
				value17 = (ims.core.configuration.domain.objects.ContractConfig)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfig.class, valueObject.getContract().getBoId());
			}
		}
		domainObject.setContract(value17);
		domainObject.setIsEmergencyReferral(valueObject.getIsEmergencyReferral());
		domainObject.setTriageOutcome(ims.RefMan.vo.domain.TriageOutcomeLiteVoAssembler.extractTriageOutcome(domainFactory, valueObject.getTriageOutcome(), domMap));

		return domainObject;
	}

}
