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
 * @author Bogdan Tofei
 */
public class ClinicalReferralsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.ClinicalReferralsVo copy(ims.clinical.vo.ClinicalReferralsVo valueObjectDest, ims.clinical.vo.ClinicalReferralsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalReferrals(valueObjectSrc.getID_ClinicalReferrals());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralType
		valueObjectDest.setReferralType(valueObjectSrc.getReferralType());
		// CurrentReferralStatus
		valueObjectDest.setCurrentReferralStatus(valueObjectSrc.getCurrentReferralStatus());
		// HistoryOfReferralStatus
		valueObjectDest.setHistoryOfReferralStatus(valueObjectSrc.getHistoryOfReferralStatus());
		// ReferringHCP
		valueObjectDest.setReferringHCP(valueObjectSrc.getReferringHCP());
		// ReferToService
		valueObjectDest.setReferToService(valueObjectSrc.getReferToService());
		// ReferToHCP
		valueObjectDest.setReferToHCP(valueObjectSrc.getReferToHCP());
		// UrgentReferral
		valueObjectDest.setUrgentReferral(valueObjectSrc.getUrgentReferral());
		// NewCondition
		valueObjectDest.setNewCondition(valueObjectSrc.getNewCondition());
		// RequiresAuthorisation
		valueObjectDest.setRequiresAuthorisation(valueObjectSrc.getRequiresAuthorisation());
		// ServiceSpecificAnswers
		valueObjectDest.setServiceSpecificAnswers(valueObjectSrc.getServiceSpecificAnswers());
		// ReasonForReferral
		valueObjectDest.setReasonForReferral(valueObjectSrc.getReasonForReferral());
		// DateDecisionToRefer
		valueObjectDest.setDateDecisionToRefer(valueObjectSrc.getDateDecisionToRefer());
		// PathwayID
		valueObjectDest.setPathwayID(valueObjectSrc.getPathwayID());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// ReferralDocument
		valueObjectDest.setReferralDocument(valueObjectSrc.getReferralDocument());
		// ClinicalReferralNotes
		valueObjectDest.setClinicalReferralNotes(valueObjectSrc.getClinicalReferralNotes());
		// AcknowledgeRejection
		valueObjectDest.setAcknowledgeRejection(valueObjectSrc.getAcknowledgeRejection());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferringService
		valueObjectDest.setReferringService(valueObjectSrc.getReferringService());
		// AuthorisingInfo
		valueObjectDest.setAuthorisingInfo(valueObjectSrc.getAuthorisingInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalReferralsVoCollectionFromClinicalReferrals(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ClinicalReferrals objects.
	 */
	public static ims.clinical.vo.ClinicalReferralsVoCollection createClinicalReferralsVoCollectionFromClinicalReferrals(java.util.Set domainObjectSet)	
	{
		return createClinicalReferralsVoCollectionFromClinicalReferrals(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.ClinicalReferrals objects.
	 */
	public static ims.clinical.vo.ClinicalReferralsVoCollection createClinicalReferralsVoCollectionFromClinicalReferrals(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.ClinicalReferralsVoCollection voList = new ims.clinical.vo.ClinicalReferralsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.ClinicalReferrals domainObject = (ims.clinical.domain.objects.ClinicalReferrals) iterator.next();
			ims.clinical.vo.ClinicalReferralsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.ClinicalReferrals objects.
	 */
	public static ims.clinical.vo.ClinicalReferralsVoCollection createClinicalReferralsVoCollectionFromClinicalReferrals(java.util.List domainObjectList) 
	{
		return createClinicalReferralsVoCollectionFromClinicalReferrals(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.ClinicalReferrals objects.
	 */
	public static ims.clinical.vo.ClinicalReferralsVoCollection createClinicalReferralsVoCollectionFromClinicalReferrals(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.ClinicalReferralsVoCollection voList = new ims.clinical.vo.ClinicalReferralsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.ClinicalReferrals domainObject = (ims.clinical.domain.objects.ClinicalReferrals) domainObjectList.get(i);
			ims.clinical.vo.ClinicalReferralsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.ClinicalReferrals set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalReferralsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVoCollection voCollection) 
	 {
	 	return extractClinicalReferralsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalReferralsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalReferralsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ClinicalReferrals domainObject = ClinicalReferralsVoAssembler.extractClinicalReferrals(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.ClinicalReferrals list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalReferralsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVoCollection voCollection) 
	 {
	 	return extractClinicalReferralsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalReferralsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.ClinicalReferralsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.ClinicalReferrals domainObject = ClinicalReferralsVoAssembler.extractClinicalReferrals(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.ClinicalReferrals object.
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferrals
	 */
	 public static ims.clinical.vo.ClinicalReferralsVo create(ims.clinical.domain.objects.ClinicalReferrals domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.ClinicalReferrals object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.ClinicalReferralsVo create(DomainObjectMap map, ims.clinical.domain.objects.ClinicalReferrals domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.ClinicalReferralsVo valueObject = (ims.clinical.vo.ClinicalReferralsVo) map.getValueObject(domainObject, ims.clinical.vo.ClinicalReferralsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.ClinicalReferralsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferrals
	 */
	 public static ims.clinical.vo.ClinicalReferralsVo insert(ims.clinical.vo.ClinicalReferralsVo valueObject, ims.clinical.domain.objects.ClinicalReferrals domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.ClinicalReferrals
	 */
	 public static ims.clinical.vo.ClinicalReferralsVo insert(DomainObjectMap map, ims.clinical.vo.ClinicalReferralsVo valueObject, ims.clinical.domain.objects.ClinicalReferrals domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalReferrals(domainObject.getId());
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
			
		// ReferralType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getReferralType();
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

			ims.clinical.vo.lookups.ClinicalReferralType voLookup1 = new ims.clinical.vo.lookups.ClinicalReferralType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.ClinicalReferralType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.ClinicalReferralType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setReferralType(voLookup1);
		}
				// CurrentReferralStatus
		valueObject.setCurrentReferralStatus(ims.clinical.vo.domain.ClinicalReferralStatusVoAssembler.create(map, domainObject.getCurrentReferralStatus()) );
		// HistoryOfReferralStatus
		valueObject.setHistoryOfReferralStatus(ims.clinical.vo.domain.ClinicalReferralStatusVoAssembler.createClinicalReferralStatusVoCollectionFromClinicalReferralStatus(map, domainObject.getHistoryOfReferralStatus()) );
		// ReferringHCP
		valueObject.setReferringHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferringHCP()) );
		// ReferToService
		valueObject.setReferToService(ims.clinical.vo.domain.ServiceConfigIntReferralForReferralVoAssembler.create(map, domainObject.getReferToService()) );
		// ReferToHCP
		valueObject.setReferToHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getReferToHCP()) );
		// UrgentReferral
		valueObject.setUrgentReferral( domainObject.isUrgentReferral() );
		// NewCondition
		valueObject.setNewCondition( domainObject.isNewCondition() );
		// RequiresAuthorisation
		valueObject.setRequiresAuthorisation( domainObject.isRequiresAuthorisation() );
		// ServiceSpecificAnswers
		valueObject.setServiceSpecificAnswers(ims.assessment.vo.domain.PatientAssessmentQuestionVoAssembler.createPatientAssessmentQuestionVoCollectionFromPatientAssessmentQuestion(map, domainObject.getServiceSpecificAnswers()) );
		// ReasonForReferral
		valueObject.setReasonForReferral(domainObject.getReasonForReferral());
		// DateDecisionToRefer
		java.util.Date DateDecisionToRefer = domainObject.getDateDecisionToRefer();
		if ( null != DateDecisionToRefer ) 
		{
			valueObject.setDateDecisionToRefer(new ims.framework.utils.Date(DateDecisionToRefer) );
		}
		// PathwayID
		valueObject.setPathwayID(domainObject.getPathwayID());
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// ReferralDocument
		ims.core.documents.vo.PatientDocumentRefVoCollection ReferralDocument = new ims.core.documents.vo.PatientDocumentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getReferralDocument().iterator(); iterator.hasNext(); ) 
		{
			ims.core.documents.domain.objects.PatientDocument tmp = (ims.core.documents.domain.objects.PatientDocument)iterator.next();
			if (tmp != null)
				ReferralDocument.add(new ims.core.documents.vo.PatientDocumentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setReferralDocument(ReferralDocument);
		// ClinicalReferralNotes
		valueObject.setClinicalReferralNotes(ims.clinical.vo.domain.ClinicalReferralNotesVoAssembler.createClinicalReferralNotesVoCollectionFromClinicalReferralNotes(map, domainObject.getClinicalReferralNotes()) );
		// AcknowledgeRejection
		valueObject.setAcknowledgeRejection( domainObject.isAcknowledgeRejection() );
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
		// ReferringService
		valueObject.setReferringService(ims.core.vo.domain.ServiceLiteVoAssembler.create(map, domainObject.getReferringService()) );
		// AuthorisingInfo
		valueObject.setAuthorisingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getAuthorisingInfo()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.ClinicalReferrals extractClinicalReferrals(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVo valueObject) 
	{
		return 	extractClinicalReferrals(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.ClinicalReferrals extractClinicalReferrals(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.ClinicalReferralsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalReferrals();
		ims.clinical.domain.objects.ClinicalReferrals domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.ClinicalReferrals)domMap.get(valueObject);
			}
			// ims.clinical.vo.ClinicalReferralsVo ID_ClinicalReferrals field is unknown
			domainObject = new ims.clinical.domain.objects.ClinicalReferrals();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalReferrals());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.ClinicalReferrals)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.ClinicalReferrals) domainFactory.getDomainObject(ims.clinical.domain.objects.ClinicalReferrals.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalReferrals());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getReferralType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getReferralType().getID());
		}
		domainObject.setReferralType(value1);
		domainObject.setCurrentReferralStatus(ims.clinical.vo.domain.ClinicalReferralStatusVoAssembler.extractClinicalReferralStatus(domainFactory, valueObject.getCurrentReferralStatus(), domMap));
		domainObject.setHistoryOfReferralStatus(ims.clinical.vo.domain.ClinicalReferralStatusVoAssembler.extractClinicalReferralStatusList(domainFactory, valueObject.getHistoryOfReferralStatus(), domainObject.getHistoryOfReferralStatus(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getReferringHCP() ) 
		{
			if (valueObject.getReferringHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringHCP()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferringHCP());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferringHCP().getBoId());
			}
		}
		domainObject.setReferringHCP(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ServiceConfigIntReferral value5 = null;
		if ( null != valueObject.getReferToService() ) 
		{
			if (valueObject.getReferToService().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferToService()) != null)
				{
					value5 = (ims.clinical.configuration.domain.objects.ServiceConfigIntReferral)domMap.get(valueObject.getReferToService());
				}
			}
			else
			{
				value5 = (ims.clinical.configuration.domain.objects.ServiceConfigIntReferral)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ServiceConfigIntReferral.class, valueObject.getReferToService().getBoId());
			}
		}
		domainObject.setReferToService(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getReferToHCP() ) 
		{
			if (valueObject.getReferToHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferToHCP()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getReferToHCP());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getReferToHCP().getBoId());
			}
		}
		domainObject.setReferToHCP(value6);
		domainObject.setUrgentReferral(valueObject.getUrgentReferral());
		domainObject.setNewCondition(valueObject.getNewCondition());
		domainObject.setRequiresAuthorisation(valueObject.getRequiresAuthorisation());
		domainObject.setServiceSpecificAnswers(ims.assessment.vo.domain.PatientAssessmentQuestionVoAssembler.extractPatientAssessmentQuestionList(domainFactory, valueObject.getServiceSpecificAnswers(), domainObject.getServiceSpecificAnswers(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForReferral() != null && valueObject.getReasonForReferral().equals(""))
		{
			valueObject.setReasonForReferral(null);
		}
		domainObject.setReasonForReferral(valueObject.getReasonForReferral());
		java.util.Date value12 = null;
		ims.framework.utils.Date date12 = valueObject.getDateDecisionToRefer();		
		if ( date12 != null ) 
		{
			value12 = date12.getDate();
		}
		domainObject.setDateDecisionToRefer(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPathwayID() != null && valueObject.getPathwayID().equals(""))
		{
			valueObject.setPathwayID(null);
		}
		domainObject.setPathwayID(valueObject.getPathwayID());
		domainObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInfo(), domMap));

		ims.core.documents.vo.PatientDocumentRefVoCollection refCollection15 = valueObject.getReferralDocument();
		int size15 = (null == refCollection15) ? 0 : refCollection15.size();		
		java.util.Set domainReferralDocument15 = domainObject.getReferralDocument();
		if (domainReferralDocument15 == null)
		{
			domainReferralDocument15 = new java.util.HashSet();
		}
		java.util.Set newSet15  = new java.util.HashSet();
		for(int i=0; i<size15; i++) 
		{
			ims.core.documents.vo.PatientDocumentRefVo vo = refCollection15.get(i);					
			ims.core.documents.domain.objects.PatientDocument dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.documents.domain.objects.PatientDocument)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject( ims.core.documents.domain.objects.PatientDocument.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReferralDocument15.contains(dom))
			{
				domainReferralDocument15.add(dom);
			}
			newSet15.add(dom);			
		}
		java.util.Set removedSet15 = new java.util.HashSet();
		java.util.Iterator iter15 = domainReferralDocument15.iterator();
		//Find out which objects need to be removed
		while (iter15.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter15.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet15.contains(o))
			{
				removedSet15.add(o);
			}
		}
		iter15 = removedSet15.iterator();
		//Remove the unwanted objects
		while (iter15.hasNext())
		{
			domainReferralDocument15.remove(iter15.next());
		}		
		
		domainObject.setReferralDocument(domainReferralDocument15);		
		domainObject.setClinicalReferralNotes(ims.clinical.vo.domain.ClinicalReferralNotesVoAssembler.extractClinicalReferralNotesList(domainFactory, valueObject.getClinicalReferralNotes(), domainObject.getClinicalReferralNotes(), domMap));		
		domainObject.setAcknowledgeRejection(valueObject.getAcknowledgeRejection());
		ims.core.patient.domain.objects.Patient value18 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value18 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getPatient();	
			}
			else
			{
				value18 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value18);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value19 = null;
		if ( null != valueObject.getReferringService() ) 
		{
			if (valueObject.getReferringService().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferringService()) != null)
				{
					value19 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getReferringService());
				}
			}
			else
			{
				value19 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getReferringService().getBoId());
			}
		}
		domainObject.setReferringService(value19);
		domainObject.setAuthorisingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getAuthorisingInfo(), domMap));

		return domainObject;
	}

}
