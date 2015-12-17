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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class TriageOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.TriageOutcomeVo copy(ims.RefMan.vo.TriageOutcomeVo valueObjectDest, ims.RefMan.vo.TriageOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TriageOutcome(valueObjectSrc.getID_TriageOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TriageOutcomeStatus
		valueObjectDest.setTriageOutcomeStatus(valueObjectSrc.getTriageOutcomeStatus());
		// AcceptedDetails
		valueObjectDest.setAcceptedDetails(valueObjectSrc.getAcceptedDetails());
		// TriagePendingDiagnosticResult
		valueObjectDest.setTriagePendingDiagnosticResult(valueObjectSrc.getTriagePendingDiagnosticResult());
		// RedirectReferralDetails
		valueObjectDest.setRedirectReferralDetails(valueObjectSrc.getRedirectReferralDetails());
		// RecordingUser
		valueObjectDest.setRecordingUser(valueObjectSrc.getRecordingUser());
		// RecordingDateTime
		valueObjectDest.setRecordingDateTime(valueObjectSrc.getRecordingDateTime());
		// TriagePendingDiagnosticResultComment
		valueObjectDest.setTriagePendingDiagnosticResultComment(valueObjectSrc.getTriagePendingDiagnosticResultComment());
		// AwaitingClinicalInformationComment
		valueObjectDest.setAwaitingClinicalInformationComment(valueObjectSrc.getAwaitingClinicalInformationComment());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTriageOutcomeVoCollectionFromTriageOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TriageOutcome objects.
	 */
	public static ims.RefMan.vo.TriageOutcomeVoCollection createTriageOutcomeVoCollectionFromTriageOutcome(java.util.Set domainObjectSet)	
	{
		return createTriageOutcomeVoCollectionFromTriageOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TriageOutcome objects.
	 */
	public static ims.RefMan.vo.TriageOutcomeVoCollection createTriageOutcomeVoCollectionFromTriageOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.TriageOutcomeVoCollection voList = new ims.RefMan.vo.TriageOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.TriageOutcome domainObject = (ims.RefMan.domain.objects.TriageOutcome) iterator.next();
			ims.RefMan.vo.TriageOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TriageOutcome objects.
	 */
	public static ims.RefMan.vo.TriageOutcomeVoCollection createTriageOutcomeVoCollectionFromTriageOutcome(java.util.List domainObjectList) 
	{
		return createTriageOutcomeVoCollectionFromTriageOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TriageOutcome objects.
	 */
	public static ims.RefMan.vo.TriageOutcomeVoCollection createTriageOutcomeVoCollectionFromTriageOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.TriageOutcomeVoCollection voList = new ims.RefMan.vo.TriageOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TriageOutcome domainObject = (ims.RefMan.domain.objects.TriageOutcome) domainObjectList.get(i);
			ims.RefMan.vo.TriageOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.TriageOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTriageOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVoCollection voCollection) 
	 {
	 	return extractTriageOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTriageOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TriageOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TriageOutcome domainObject = TriageOutcomeVoAssembler.extractTriageOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.TriageOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTriageOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVoCollection voCollection) 
	 {
	 	return extractTriageOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTriageOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TriageOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TriageOutcome domainObject = TriageOutcomeVoAssembler.extractTriageOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.TriageOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.TriageOutcome
	 */
	 public static ims.RefMan.vo.TriageOutcomeVo create(ims.RefMan.domain.objects.TriageOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.TriageOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.TriageOutcomeVo create(DomainObjectMap map, ims.RefMan.domain.objects.TriageOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.TriageOutcomeVo valueObject = (ims.RefMan.vo.TriageOutcomeVo) map.getValueObject(domainObject, ims.RefMan.vo.TriageOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.TriageOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.TriageOutcome
	 */
	 public static ims.RefMan.vo.TriageOutcomeVo insert(ims.RefMan.vo.TriageOutcomeVo valueObject, ims.RefMan.domain.objects.TriageOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.TriageOutcome
	 */
	 public static ims.RefMan.vo.TriageOutcomeVo insert(DomainObjectMap map, ims.RefMan.vo.TriageOutcomeVo valueObject, ims.RefMan.domain.objects.TriageOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TriageOutcome(domainObject.getId());
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
			
		// TriageOutcomeStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTriageOutcomeStatus();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.TriageOutcomeStatus voLookup1 = new ims.RefMan.vo.lookups.TriageOutcomeStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.RefMan.vo.lookups.TriageOutcomeStatus parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.RefMan.vo.lookups.TriageOutcomeStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTriageOutcomeStatus(voLookup1);
		}
				// AcceptedDetails
		valueObject.setAcceptedDetails(ims.RefMan.vo.domain.OutcomeAcceptedDetailsVoAssembler.create(map, domainObject.getAcceptedDetails()) );
		// TriagePendingDiagnosticResult
		valueObject.setTriagePendingDiagnosticResult(ims.RefMan.vo.domain.LinkedDiagnosticVoAssembler.createLinkedDiagnosticVoCollectionFromLinkedDiagnostic(map, domainObject.getTriagePendingDiagnosticResult()) );
		// RedirectReferralDetails
		valueObject.setRedirectReferralDetails(ims.RefMan.vo.domain.RedirectReferralDetailsVoAssembler.create(map, domainObject.getRedirectReferralDetails()) );
		// RecordingUser
		if (domainObject.getRecordingUser() != null)
		{
			if(domainObject.getRecordingUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRecordingUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setRecordingUser(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getRecordingUser().getId(), domainObject.getRecordingUser().getVersion()));
			}
		}
		// RecordingDateTime
		java.util.Date RecordingDateTime = domainObject.getRecordingDateTime();
		if ( null != RecordingDateTime ) 
		{
			valueObject.setRecordingDateTime(new ims.framework.utils.DateTime(RecordingDateTime) );
		}
		// TriagePendingDiagnosticResultComment
		valueObject.setTriagePendingDiagnosticResultComment(domainObject.getTriagePendingDiagnosticResultComment());
		// AwaitingClinicalInformationComment
		valueObject.setAwaitingClinicalInformationComment(domainObject.getAwaitingClinicalInformationComment());
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TriageOutcome extractTriageOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVo valueObject) 
	{
		return 	extractTriageOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TriageOutcome extractTriageOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TriageOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TriageOutcome();
		ims.RefMan.domain.objects.TriageOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.TriageOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.TriageOutcomeVo ID_TriageOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.TriageOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TriageOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.TriageOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.TriageOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.TriageOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TriageOutcome());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTriageOutcomeStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTriageOutcomeStatus().getID());
		}
		domainObject.setTriageOutcomeStatus(value1);
		domainObject.setAcceptedDetails(ims.RefMan.vo.domain.OutcomeAcceptedDetailsVoAssembler.extractOutcomeAcceptedDetails(domainFactory, valueObject.getAcceptedDetails(), domMap));
		domainObject.setTriagePendingDiagnosticResult(ims.RefMan.vo.domain.LinkedDiagnosticVoAssembler.extractLinkedDiagnosticList(domainFactory, valueObject.getTriagePendingDiagnosticResult(), domainObject.getTriagePendingDiagnosticResult(), domMap));		
		domainObject.setRedirectReferralDetails(ims.RefMan.vo.domain.RedirectReferralDetailsVoAssembler.extractRedirectReferralDetails(domainFactory, valueObject.getRedirectReferralDetails(), domMap));
		ims.core.resource.people.domain.objects.MemberOfStaff value5 = null;
		if ( null != valueObject.getRecordingUser() ) 
		{
			if (valueObject.getRecordingUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingUser()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRecordingUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getRecordingUser();	
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRecordingUser().getBoId());
			}
		}
		domainObject.setRecordingUser(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getRecordingDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setRecordingDateTime(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTriagePendingDiagnosticResultComment() != null && valueObject.getTriagePendingDiagnosticResultComment().equals(""))
		{
			valueObject.setTriagePendingDiagnosticResultComment(null);
		}
		domainObject.setTriagePendingDiagnosticResultComment(valueObject.getTriagePendingDiagnosticResultComment());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAwaitingClinicalInformationComment() != null && valueObject.getAwaitingClinicalInformationComment().equals(""))
		{
			valueObject.setAwaitingClinicalInformationComment(null);
		}
		domainObject.setAwaitingClinicalInformationComment(valueObject.getAwaitingClinicalInformationComment());
		ims.RefMan.domain.objects.CatsReferral value9 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value9 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getCatsReferral();	
			}
			else
			{
				value9 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value9);

		return domainObject;
	}

}
