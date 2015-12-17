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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class CatsReferralForRequestServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralForRequestServiceVo copy(ims.RefMan.vo.CatsReferralForRequestServiceVo valueObjectDest, ims.RefMan.vo.CatsReferralForRequestServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferralDetails
		valueObjectDest.setReferralDetails(valueObjectSrc.getReferralDetails());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// RTTClockImpacts
		valueObjectDest.setRTTClockImpacts(valueObjectSrc.getRTTClockImpacts());
		// LinkedReferrals
		valueObjectDest.setLinkedReferrals(valueObjectSrc.getLinkedReferrals());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Urgency
		valueObjectDest.setUrgency(valueObjectSrc.getUrgency());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// CreatingAppointment
		valueObjectDest.setCreatingAppointment(valueObjectSrc.getCreatingAppointment());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// ReferralTransfer
		valueObjectDest.setReferralTransfer(valueObjectSrc.getReferralTransfer());
		// isCAB
		valueObjectDest.setIsCAB(valueObjectSrc.getIsCAB());
		// DOS
		valueObjectDest.setDOS(valueObjectSrc.getDOS());
		// ConsUpgradeDate
		valueObjectDest.setConsUpgradeDate(valueObjectSrc.getConsUpgradeDate());
		// CancerType
		valueObjectDest.setCancerType(valueObjectSrc.getCancerType());
		// CurrentRTTStatus
		valueObjectDest.setCurrentRTTStatus(valueObjectSrc.getCurrentRTTStatus());
		// IsEmergencyReferral
		valueObjectDest.setIsEmergencyReferral(valueObjectSrc.getIsEmergencyReferral());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralForRequestServiceVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForRequestServiceVoCollection createCatsReferralForRequestServiceVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralForRequestServiceVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForRequestServiceVoCollection createCatsReferralForRequestServiceVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voList = new ims.RefMan.vo.CatsReferralForRequestServiceVoCollection();
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
			ims.RefMan.vo.CatsReferralForRequestServiceVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.CatsReferralForRequestServiceVoCollection createCatsReferralForRequestServiceVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralForRequestServiceVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralForRequestServiceVoCollection createCatsReferralForRequestServiceVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voList = new ims.RefMan.vo.CatsReferralForRequestServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralForRequestServiceVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralForRequestServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralForRequestServiceVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralForRequestServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralForRequestServiceVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.CatsReferralForRequestServiceVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	  public static ims.RefMan.vo.CatsReferralForRequestServiceVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralForRequestServiceVo valueObject = (ims.RefMan.vo.CatsReferralForRequestServiceVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralForRequestServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralForRequestServiceVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.CatsReferralForRequestServiceVo insert(ims.RefMan.vo.CatsReferralForRequestServiceVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 public static ims.RefMan.vo.CatsReferralForRequestServiceVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralForRequestServiceVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
			
		// Patient
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
		// ReferralDetails
		valueObject.setReferralDetails(ims.clinical.vo.domain.ReferralLeterDetailsForCatsRefVoAssembler.create(map, domainObject.getReferralDetails()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// RTTClockImpacts
		ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection RTTClockImpacts = new ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getRTTClockImpacts().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.PathwaysRTTClockImpact tmp = (ims.pathways.domain.objects.PathwaysRTTClockImpact)iterator.next();
			if (tmp != null)
				RTTClockImpacts.add(new ims.pathways.vo.PathwaysRTTClockImpactRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setRTTClockImpacts(RTTClockImpacts);
		// LinkedReferrals
		ims.RefMan.vo.LinkedCatsReferralRefVoCollection LinkedReferrals = new ims.RefMan.vo.LinkedCatsReferralRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getLinkedReferrals().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.LinkedCatsReferral tmp = (ims.RefMan.domain.objects.LinkedCatsReferral)iterator.next();
			if (tmp != null)
				LinkedReferrals.add(new ims.RefMan.vo.LinkedCatsReferralRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setLinkedReferrals(LinkedReferrals);
		// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// CareContext
		valueObject.setCareContext(ims.RefMan.vo.domain.CareContextForRequestServiceShortVoAssembler.create(map, domainObject.getCareContext()) );
		// Urgency
		ims.domain.lookups.LookupInstance instance8 = domainObject.getUrgency();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ReferralUrgency voLookup8 = new ims.RefMan.vo.lookups.ReferralUrgency(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ReferralUrgency parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.RefMan.vo.lookups.ReferralUrgency(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setUrgency(voLookup8);
		}
				// RTTClockImpact
		valueObject.setRTTClockImpact( domainObject.isRTTClockImpact() );
		// CreatingAppointment
		if (domainObject.getCreatingAppointment() != null)
		{
			if(domainObject.getCreatingAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCreatingAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setCreatingAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getCreatingAppointment().getId(), domainObject.getCreatingAppointment().getVersion()));
			}
		}
		// Contract
		valueObject.setContract(ims.RefMan.vo.domain.ContractConfigForReferralDetailsComponentVoAssembler.create(map, domainObject.getContract()) );
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// Journey
		if (domainObject.getJourney() != null)
		{
			if(domainObject.getJourney() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getJourney();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(id, -1));				
			}
			else
			{
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(domainObject.getJourney().getId(), domainObject.getJourney().getVersion()));
			}
		}
		// ReferralTransfer
		valueObject.setReferralTransfer(ims.RefMan.vo.domain.ReferralTransferVoAssembler.create(map, domainObject.getReferralTransfer()) );
		// isCAB
		valueObject.setIsCAB( domainObject.isIsCAB() );
		// DOS
		valueObject.setDOS(ims.scheduling.vo.domain.DirectoryOfServiceForCatsReferralWizardVoAssembler.create(map, domainObject.getDOS()) );
		// ConsUpgradeDate
		java.util.Date ConsUpgradeDate = domainObject.getConsUpgradeDate();
		if ( null != ConsUpgradeDate ) 
		{
			valueObject.setConsUpgradeDate(new ims.framework.utils.Date(ConsUpgradeDate) );
		}
		// CancerType
		ims.domain.lookups.LookupInstance instance18 = domainObject.getCancerType();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.CancerType voLookup18 = new ims.RefMan.vo.lookups.CancerType(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CancerType parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.RefMan.vo.lookups.CancerType(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setCancerType(voLookup18);
		}
				// CurrentRTTStatus
		valueObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.create(map, domainObject.getCurrentRTTStatus()) );
		// IsEmergencyReferral
		valueObject.setIsEmergencyReferral( domainObject.isIsEmergencyReferral() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralForRequestServiceVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.CatsReferralForRequestServiceVo ID_CatsReferral field is unknown
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

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		domainObject.setReferralDetails(ims.clinical.vo.domain.ReferralLeterDetailsForCatsRefVoAssembler.extractReferralLetterDetails(domainFactory, valueObject.getReferralDetails(), domMap));
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));

		ims.pathways.vo.PathwaysRTTClockImpactRefVoCollection refCollection4 = valueObject.getRTTClockImpacts();
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainRTTClockImpacts4 = domainObject.getRTTClockImpacts();
		if (domainRTTClockImpacts4 == null)
		{
			domainRTTClockImpacts4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.pathways.vo.PathwaysRTTClockImpactRefVo vo = refCollection4.get(i);			
			ims.pathways.domain.objects.PathwaysRTTClockImpact dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domainFactory.getDomainObject( ims.pathways.domain.objects.PathwaysRTTClockImpact.class, vo.getBoId());
				}
			}

			int domIdx = domainRTTClockImpacts4.indexOf(dom);
			if (domIdx == -1)
			{
				domainRTTClockImpacts4.add(i, dom);
			}
			else if (i != domIdx && i < domainRTTClockImpacts4.size())
			{
				Object tmp = domainRTTClockImpacts4.get(i);
				domainRTTClockImpacts4.set(i, domainRTTClockImpacts4.get(domIdx));
				domainRTTClockImpacts4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainRTTClockImpacts4.size();
		while (i4 > size4)
		{
			domainRTTClockImpacts4.remove(i4-1);
			i4 = domainRTTClockImpacts4.size();
		}
		
		domainObject.setRTTClockImpacts(domainRTTClockImpacts4);		

		ims.RefMan.vo.LinkedCatsReferralRefVoCollection refCollection5 = valueObject.getLinkedReferrals();
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.List domainLinkedReferrals5 = domainObject.getLinkedReferrals();
		if (domainLinkedReferrals5 == null)
		{
			domainLinkedReferrals5 = new java.util.ArrayList();
		}
		for(int i=0; i < size5; i++) 
		{
			ims.RefMan.vo.LinkedCatsReferralRefVo vo = refCollection5.get(i);			
			ims.RefMan.domain.objects.LinkedCatsReferral dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.LinkedCatsReferral)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.LinkedCatsReferral)domainFactory.getDomainObject( ims.RefMan.domain.objects.LinkedCatsReferral.class, vo.getBoId());
				}
			}

			int domIdx = domainLinkedReferrals5.indexOf(dom);
			if (domIdx == -1)
			{
				domainLinkedReferrals5.add(i, dom);
			}
			else if (i != domIdx && i < domainLinkedReferrals5.size())
			{
				Object tmp = domainLinkedReferrals5.get(i);
				domainLinkedReferrals5.set(i, domainLinkedReferrals5.get(domIdx));
				domainLinkedReferrals5.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i5 = domainLinkedReferrals5.size();
		while (i5 > size5)
		{
			domainLinkedReferrals5.remove(i5-1);
			i5 = domainLinkedReferrals5.size();
		}
		
		domainObject.setLinkedReferrals(domainLinkedReferrals5);		
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setCareContext(ims.RefMan.vo.domain.CareContextForRequestServiceShortVoAssembler.extractCareContext(domainFactory, valueObject.getCareContext(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getUrgency() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getUrgency().getID());
		}
		domainObject.setUrgency(value8);
		domainObject.setRTTClockImpact(valueObject.getRTTClockImpact());
		ims.scheduling.domain.objects.Booking_Appointment value10 = null;
		if ( null != valueObject.getCreatingAppointment() ) 
		{
			if (valueObject.getCreatingAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getCreatingAppointment()) != null)
				{
					value10 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getCreatingAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getCreatingAppointment();	
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getCreatingAppointment().getBoId());
			}
		}
		domainObject.setCreatingAppointment(value10);
		domainObject.setContract(ims.RefMan.vo.domain.ContractConfigForReferralDetailsComponentVoAssembler.extractContractConfig(domainFactory, valueObject.getContract(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		ims.pathways.domain.objects.PatientPathwayJourney value13 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value13 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getJourney();	
			}
			else
			{
				value13 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value13);
		domainObject.setReferralTransfer(ims.RefMan.vo.domain.ReferralTransferVoAssembler.extractReferralTransfer(domainFactory, valueObject.getReferralTransfer(), domMap));
		domainObject.setIsCAB(valueObject.getIsCAB());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.DirectoryofService value16 = null;
		if ( null != valueObject.getDOS() ) 
		{
			if (valueObject.getDOS().getBoId() == null)
			{
				if (domMap.get(valueObject.getDOS()) != null)
				{
					value16 = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(valueObject.getDOS());
				}
			}
			else
			{
				value16 = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject(ims.scheduling.domain.objects.DirectoryofService.class, valueObject.getDOS().getBoId());
			}
		}
		domainObject.setDOS(value16);
		java.util.Date value17 = null;
		ims.framework.utils.Date date17 = valueObject.getConsUpgradeDate();		
		if ( date17 != null ) 
		{
			value17 = date17.getDate();
		}
		domainObject.setConsUpgradeDate(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getCancerType() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getCancerType().getID());
		}
		domainObject.setCancerType(value18);
		domainObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.extractPathwayRTTStatus(domainFactory, valueObject.getCurrentRTTStatus(), domMap));
		domainObject.setIsEmergencyReferral(valueObject.getIsEmergencyReferral());

		return domainObject;
	}

}
