/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class CatsReferralListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralListVo copy(ims.RefMan.vo.CatsReferralListVo valueObjectDest, ims.RefMan.vo.CatsReferralListVo valueObjectSrc) 
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
		// hasDocuments
		valueObjectDest.setHasDocuments(valueObjectSrc.getHasDocuments());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// hasInvestigations
		valueObjectDest.setHasInvestigations(valueObjectSrc.getHasInvestigations());
		// hasAppointments
		valueObjectDest.setHasAppointments(valueObjectSrc.getHasAppointments());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// hasReferralLetter
		valueObjectDest.setHasReferralLetter(valueObjectSrc.getHasReferralLetter());
		// isCAB
		valueObjectDest.setIsCAB(valueObjectSrc.getIsCAB());
		// ConsultationAppt
		valueObjectDest.setConsultationAppt(valueObjectSrc.getConsultationAppt());
		// AdditionalInvApptsStatus
		valueObjectDest.setAdditionalInvApptsStatus(valueObjectSrc.getAdditionalInvApptsStatus());
		// hasRejectedInv
		valueObjectDest.setHasRejectedInv(valueObjectSrc.getHasRejectedInv());
		// ProviderCancellation
		valueObjectDest.setProviderCancellation(valueObjectSrc.getProviderCancellation());
		// isFlaggedForReview
		valueObjectDest.setIsFlaggedForReview(valueObjectSrc.getIsFlaggedForReview());
		// OnwardReferralStatus
		valueObjectDest.setOnwardReferralStatus(valueObjectSrc.getOnwardReferralStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// hasConsultationDetails
		valueObjectDest.setHasConsultationDetails(valueObjectSrc.getHasConsultationDetails());
		// LastApptArrivedDate
		valueObjectDest.setLastApptArrivedDate(valueObjectSrc.getLastApptArrivedDate());
		// hasTLTStartContact
		valueObjectDest.setHasTLTStartContact(valueObjectSrc.getHasTLTStartContact());
		// isSuitableForSurgery
		valueObjectDest.setIsSuitableForSurgery(valueObjectSrc.getIsSuitableForSurgery());
		// isFitForSurgery
		valueObjectDest.setIsFitForSurgery(valueObjectSrc.getIsFitForSurgery());
		// hasTheatreAppt
		valueObjectDest.setHasTheatreAppt(valueObjectSrc.getHasTheatreAppt());
		// hasDNAApptsForReview
		valueObjectDest.setHasDNAApptsForReview(valueObjectSrc.getHasDNAApptsForReview());
		// hasCancelledApptsForReview
		valueObjectDest.setHasCancelledApptsForReview(valueObjectSrc.getHasCancelledApptsForReview());
		// isCurrentlyAllocated
		valueObjectDest.setIsCurrentlyAllocated(valueObjectSrc.getIsCurrentlyAllocated());
		// isAwaitingClinicalInfo
		valueObjectDest.setIsAwaitingClinicalInfo(valueObjectSrc.getIsAwaitingClinicalInfo());
		// AwaitingClinicalInfo
		valueObjectDest.setAwaitingClinicalInfo(valueObjectSrc.getAwaitingClinicalInfo());
		// OPDLocation
		valueObjectDest.setOPDLocation(valueObjectSrc.getOPDLocation());
		// SuitableForSurgeryDate
		valueObjectDest.setSuitableForSurgeryDate(valueObjectSrc.getSuitableForSurgeryDate());
		// EndOfCareDate
		valueObjectDest.setEndOfCareDate(valueObjectSrc.getEndOfCareDate());
		// Contract
		valueObjectDest.setContract(valueObjectSrc.getContract());
		// AdminEvent
		valueObjectDest.setAdminEvent(valueObjectSrc.getAdminEvent());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralListVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralListVoCollection createCatsReferralListVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralListVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralListVoCollection createCatsReferralListVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralListVoCollection voList = new ims.RefMan.vo.CatsReferralListVoCollection();
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
			ims.RefMan.vo.CatsReferralListVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.CatsReferralListVoCollection createCatsReferralListVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralListVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralListVoCollection createCatsReferralListVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralListVoCollection voList = new ims.RefMan.vo.CatsReferralListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralListVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralListVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralListVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.CatsReferralListVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	  public static ims.RefMan.vo.CatsReferralListVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralListVo valueObject = (ims.RefMan.vo.CatsReferralListVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.CatsReferralListVo insert(ims.RefMan.vo.CatsReferralListVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 public static ims.RefMan.vo.CatsReferralListVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralListVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
		valueObject.setPatient(ims.core.vo.domain.PatientShortListVoAssembler.create(map, domainObject.getPatient()) );
		// ReferralDetails
		valueObject.setReferralDetails(ims.RefMan.vo.domain.ReferralLetterDetailsLiteVoAssembler.create(map, domainObject.getReferralDetails()) );
		// hasDocuments
		valueObject.setHasDocuments( domainObject.isHasDocuments() );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// hasInvestigations
		valueObject.setHasInvestigations( domainObject.isHasInvestigations() );
		// hasAppointments
		valueObject.setHasAppointments( domainObject.isHasAppointments() );
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// hasReferralLetter
		valueObject.setHasReferralLetter( domainObject.isHasReferralLetter() );
		// isCAB
		valueObject.setIsCAB( domainObject.isIsCAB() );
		// ConsultationAppt
		valueObject.setConsultationAppt(ims.scheduling.vo.domain.BookingAppointmentLiteVoAssembler.create(map, domainObject.getConsultationAppt()) );
		// AdditionalInvApptsStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getAdditionalInvApptsStatus();
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

			ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus voLookup11 = new ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.RefMan.vo.lookups.AdditionalInvestigationAppointmentsStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setAdditionalInvApptsStatus(voLookup11);
		}
				// hasRejectedInv
		valueObject.setHasRejectedInv( domainObject.isHasRejectedInv() );
		// ProviderCancellation
		if (domainObject.getProviderCancellation() != null)
		{
			if(domainObject.getProviderCancellation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProviderCancellation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProviderCancellation(new ims.RefMan.vo.ProviderCancellationRefVo(id, -1));				
			}
			else
			{
				valueObject.setProviderCancellation(new ims.RefMan.vo.ProviderCancellationRefVo(domainObject.getProviderCancellation().getId(), domainObject.getProviderCancellation().getVersion()));
			}
		}
		// isFlaggedForReview
		valueObject.setIsFlaggedForReview( domainObject.isIsFlaggedForReview() );
		// OnwardReferralStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getOnwardReferralStatus();
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

			ims.RefMan.vo.lookups.OnwardReferralStatus voLookup15 = new ims.RefMan.vo.lookups.OnwardReferralStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.RefMan.vo.lookups.OnwardReferralStatus parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.RefMan.vo.lookups.OnwardReferralStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setOnwardReferralStatus(voLookup15);
		}
				// StatusHistory
		valueObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.createCatsReferralStatusVoCollectionFromCATSReferralStatus(map, domainObject.getStatusHistory()) );
		// hasConsultationDetails
		valueObject.setHasConsultationDetails( domainObject.isHasConsultationDetails() );
		// LastApptArrivedDate
		java.util.Date LastApptArrivedDate = domainObject.getLastApptArrivedDate();
		if ( null != LastApptArrivedDate ) 
		{
			valueObject.setLastApptArrivedDate(new ims.framework.utils.Date(LastApptArrivedDate) );
		}
		// hasTLTStartContact
		valueObject.setHasTLTStartContact( domainObject.isHasTLTStartContact() );
		// isSuitableForSurgery
		valueObject.setIsSuitableForSurgery( domainObject.isIsSuitableForSurgery() );
		// isFitForSurgery
		valueObject.setIsFitForSurgery( domainObject.isIsFitForSurgery() );
		// hasTheatreAppt
		valueObject.setHasTheatreAppt( domainObject.isHasTheatreAppt() );
		// hasDNAApptsForReview
		valueObject.setHasDNAApptsForReview( domainObject.isHasDNAApptsForReview() );
		// hasCancelledApptsForReview
		valueObject.setHasCancelledApptsForReview( domainObject.isHasCancelledApptsForReview() );
		// isCurrentlyAllocated
		valueObject.setIsCurrentlyAllocated( domainObject.isIsCurrentlyAllocated() );
		// isAwaitingClinicalInfo
		valueObject.setIsAwaitingClinicalInfo( domainObject.isIsAwaitingClinicalInfo() );
		// AwaitingClinicalInfo
		valueObject.setAwaitingClinicalInfo(ims.RefMan.vo.domain.AwaitingClinicalInfoVoAssembler.create(map, domainObject.getAwaitingClinicalInfo()) );
		// OPDLocation
		if (domainObject.getOPDLocation() != null)
		{
			if(domainObject.getOPDLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOPDLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOPDLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setOPDLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getOPDLocation().getId(), domainObject.getOPDLocation().getVersion()));
			}
		}
		// SuitableForSurgeryDate
		java.util.Date SuitableForSurgeryDate = domainObject.getSuitableForSurgeryDate();
		if ( null != SuitableForSurgeryDate ) 
		{
			valueObject.setSuitableForSurgeryDate(new ims.framework.utils.Date(SuitableForSurgeryDate) );
		}
		// EndOfCareDate
		java.util.Date EndOfCareDate = domainObject.getEndOfCareDate();
		if ( null != EndOfCareDate ) 
		{
			valueObject.setEndOfCareDate(new ims.framework.utils.Date(EndOfCareDate) );
		}
		// Contract
		valueObject.setContract(ims.RefMan.vo.domain.ContractConfigShortVoAssembler.create(map, domainObject.getContract()) );
		// AdminEvent
		ims.pathways.vo.AdminEventRefVoCollection AdminEvent = new ims.pathways.vo.AdminEventRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAdminEvent().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.AdminEvent tmp = (ims.pathways.domain.objects.AdminEvent)iterator.next();
			if (tmp != null)
				AdminEvent.add(new ims.pathways.vo.AdminEventRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAdminEvent(AdminEvent);
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralListVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.CatsReferralListVo ID_CatsReferral field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.ReferralLetterDetails value2 = null;
		if ( null != valueObject.getReferralDetails() ) 
		{
			if (valueObject.getReferralDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferralDetails()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.ReferralLetterDetails)domMap.get(valueObject.getReferralDetails());
				}
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.ReferralLetterDetails)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ReferralLetterDetails.class, valueObject.getReferralDetails().getBoId());
			}
		}
		domainObject.setReferralDetails(value2);
		domainObject.setHasDocuments(valueObject.getHasDocuments());
		domainObject.setCurrentStatus(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setHasInvestigations(valueObject.getHasInvestigations());
		domainObject.setHasAppointments(valueObject.getHasAppointments());
		ims.core.admin.domain.objects.CareContext value7 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value7 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getCareContext();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value7);
		domainObject.setHasReferralLetter(valueObject.getHasReferralLetter());
		domainObject.setIsCAB(valueObject.getIsCAB());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value10 = null;
		if ( null != valueObject.getConsultationAppt() ) 
		{
			if (valueObject.getConsultationAppt().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultationAppt()) != null)
				{
					value10 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getConsultationAppt());
				}
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getConsultationAppt().getBoId());
			}
		}
		domainObject.setConsultationAppt(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getAdditionalInvApptsStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getAdditionalInvApptsStatus().getID());
		}
		domainObject.setAdditionalInvApptsStatus(value11);
		domainObject.setHasRejectedInv(valueObject.getHasRejectedInv());
		ims.RefMan.domain.objects.ProviderCancellation value13 = null;
		if ( null != valueObject.getProviderCancellation() ) 
		{
			if (valueObject.getProviderCancellation().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderCancellation()) != null)
				{
					value13 = (ims.RefMan.domain.objects.ProviderCancellation)domMap.get(valueObject.getProviderCancellation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getProviderCancellation();	
			}
			else
			{
				value13 = (ims.RefMan.domain.objects.ProviderCancellation)domainFactory.getDomainObject(ims.RefMan.domain.objects.ProviderCancellation.class, valueObject.getProviderCancellation().getBoId());
			}
		}
		domainObject.setProviderCancellation(value13);
		domainObject.setIsFlaggedForReview(valueObject.getIsFlaggedForReview());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getOnwardReferralStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getOnwardReferralStatus().getID());
		}
		domainObject.setOnwardReferralStatus(value15);
		domainObject.setStatusHistory(ims.RefMan.vo.domain.CatsReferralStatusVoAssembler.extractCATSReferralStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setHasConsultationDetails(valueObject.getHasConsultationDetails());
		java.util.Date value18 = null;
		ims.framework.utils.Date date18 = valueObject.getLastApptArrivedDate();		
		if ( date18 != null ) 
		{
			value18 = date18.getDate();
		}
		domainObject.setLastApptArrivedDate(value18);
		domainObject.setHasTLTStartContact(valueObject.getHasTLTStartContact());
		domainObject.setIsSuitableForSurgery(valueObject.getIsSuitableForSurgery());
		domainObject.setIsFitForSurgery(valueObject.getIsFitForSurgery());
		domainObject.setHasTheatreAppt(valueObject.getHasTheatreAppt());
		domainObject.setHasDNAApptsForReview(valueObject.getHasDNAApptsForReview());
		domainObject.setHasCancelledApptsForReview(valueObject.getHasCancelledApptsForReview());
		domainObject.setIsCurrentlyAllocated(valueObject.getIsCurrentlyAllocated());
		domainObject.setIsAwaitingClinicalInfo(valueObject.getIsAwaitingClinicalInfo());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.AwaitingClinicalInfo value27 = null;
		if ( null != valueObject.getAwaitingClinicalInfo() ) 
		{
			if (valueObject.getAwaitingClinicalInfo().getBoId() == null)
			{
				if (domMap.get(valueObject.getAwaitingClinicalInfo()) != null)
				{
					value27 = (ims.RefMan.domain.objects.AwaitingClinicalInfo)domMap.get(valueObject.getAwaitingClinicalInfo());
				}
			}
			else
			{
				value27 = (ims.RefMan.domain.objects.AwaitingClinicalInfo)domainFactory.getDomainObject(ims.RefMan.domain.objects.AwaitingClinicalInfo.class, valueObject.getAwaitingClinicalInfo().getBoId());
			}
		}
		domainObject.setAwaitingClinicalInfo(value27);
		ims.core.resource.place.domain.objects.Location value28 = null;
		if ( null != valueObject.getOPDLocation() ) 
		{
			if (valueObject.getOPDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getOPDLocation()) != null)
				{
					value28 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getOPDLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value28 = domainObject.getOPDLocation();	
			}
			else
			{
				value28 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getOPDLocation().getBoId());
			}
		}
		domainObject.setOPDLocation(value28);
		java.util.Date value29 = null;
		ims.framework.utils.Date date29 = valueObject.getSuitableForSurgeryDate();		
		if ( date29 != null ) 
		{
			value29 = date29.getDate();
		}
		domainObject.setSuitableForSurgeryDate(value29);
		java.util.Date value30 = null;
		ims.framework.utils.Date date30 = valueObject.getEndOfCareDate();		
		if ( date30 != null ) 
		{
			value30 = date30.getDate();
		}
		domainObject.setEndOfCareDate(value30);
		domainObject.setContract(ims.RefMan.vo.domain.ContractConfigShortVoAssembler.extractContractConfig(domainFactory, valueObject.getContract(), domMap));

		ims.pathways.vo.AdminEventRefVoCollection refCollection32 = valueObject.getAdminEvent();
		int size32 = (null == refCollection32) ? 0 : refCollection32.size();		
		java.util.List domainAdminEvent32 = domainObject.getAdminEvent();
		if (domainAdminEvent32 == null)
		{
			domainAdminEvent32 = new java.util.ArrayList();
		}
		for(int i=0; i < size32; i++) 
		{
			ims.pathways.vo.AdminEventRefVo vo = refCollection32.get(i);			
			ims.pathways.domain.objects.AdminEvent dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.AdminEvent)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.AdminEvent)domainFactory.getDomainObject( ims.pathways.domain.objects.AdminEvent.class, vo.getBoId());
				}
			}

			int domIdx = domainAdminEvent32.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdminEvent32.add(i, dom);
			}
			else if (i != domIdx && i < domainAdminEvent32.size())
			{
				Object tmp = domainAdminEvent32.get(i);
				domainAdminEvent32.set(i, domainAdminEvent32.get(domIdx));
				domainAdminEvent32.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i32 = domainAdminEvent32.size();
		while (i32 > size32)
		{
			domainAdminEvent32.remove(i32-1);
			i32 = domainAdminEvent32.size();
		}
		
		domainObject.setAdminEvent(domainAdminEvent32);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());

		return domainObject;
	}

}
