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
 * @author Cornel Ventuneac
 */
public class PatientElectiveListForPreassessmentOutcVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo copy(ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObjectDest, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PreAssessmentOutcome
		valueObjectDest.setPreAssessmentOutcome(valueObjectSrc.getPreAssessmentOutcome());
		// FitForSurgery
		valueObjectDest.setFitForSurgery(valueObjectSrc.getFitForSurgery());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// ProcLaterality
		valueObjectDest.setProcLaterality(valueObjectSrc.getProcLaterality());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// SecondaryProcLaterality
		valueObjectDest.setSecondaryProcLaterality(valueObjectSrc.getSecondaryProcLaterality());
		// WLAnaestheticType
		valueObjectDest.setWLAnaestheticType(valueObjectSrc.getWLAnaestheticType());
		// hasPacemakerDefib
		valueObjectDest.setHasPacemakerDefib(valueObjectSrc.getHasPacemakerDefib());
		// PatientReceivingAnticoagulantTherapy
		valueObjectDest.setPatientReceivingAnticoagulantTherapy(valueObjectSrc.getPatientReceivingAnticoagulantTherapy());
		// WLPatientReceivingAnticoagulantTherapy
		valueObjectDest.setWLPatientReceivingAnticoagulantTherapy(valueObjectSrc.getWLPatientReceivingAnticoagulantTherapy());
		// AvailableAtShortNotice
		valueObjectDest.setAvailableAtShortNotice(valueObjectSrc.getAvailableAtShortNotice());
		// WLAvailableAtShortNotice
		valueObjectDest.setWLAvailableAtShortNotice(valueObjectSrc.getWLAvailableAtShortNotice());
		// AvailableAtShortNoticePeriod
		valueObjectDest.setAvailableAtShortNoticePeriod(valueObjectSrc.getAvailableAtShortNoticePeriod());
		// WLAvailableAtShortNoticePeriod
		valueObjectDest.setWLAvailableAtShortNoticePeriod(valueObjectSrc.getWLAvailableAtShortNoticePeriod());
		// PreOperativeOvernightStayRequired
		valueObjectDest.setPreOperativeOvernightStayRequired(valueObjectSrc.getPreOperativeOvernightStayRequired());
		// WLPreOperativeOvernightStayRequired
		valueObjectDest.setWLPreOperativeOvernightStayRequired(valueObjectSrc.getWLPreOperativeOvernightStayRequired());
		// NoOfPreOperativeNights
		valueObjectDest.setNoOfPreOperativeNights(valueObjectSrc.getNoOfPreOperativeNights());
		// WLNoOfPreOperativeNights
		valueObjectDest.setWLNoOfPreOperativeNights(valueObjectSrc.getWLNoOfPreOperativeNights());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// WLAnticipatedStay
		valueObjectDest.setWLAnticipatedStay(valueObjectSrc.getWLAnticipatedStay());
		// RequiredTheatreType
		valueObjectDest.setRequiredTheatreType(valueObjectSrc.getRequiredTheatreType());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// CriticalCareBedRequired
		valueObjectDest.setCriticalCareBedRequired(valueObjectSrc.getCriticalCareBedRequired());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// Hospital
		valueObjectDest.setHospital(valueObjectSrc.getHospital());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voList = new ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) iterator.next();
			ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection createPatientElectiveListForPreassessmentOutcVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voList = new ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForPreassessmentOutcVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.PatientElectiveList list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForPreassessmentOutcVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.PatientElectiveList object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObject = (ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo insert(ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.PatientElectiveList
	 */
	 public static ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientElectiveList(domainObject.getId());
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
			
		// PreAssessmentOutcome
		valueObject.setPreAssessmentOutcome(ims.RefMan.vo.domain.PreAssessmentOutcomeVoAssembler.create(map, domainObject.getPreAssessmentOutcome()) );
		// FitForSurgery
		ims.domain.lookups.LookupInstance instance2 = domainObject.getFitForSurgery();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setFitForSurgery(voLookup2);
		}
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
		// ElectiveList
		valueObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.create(map, domainObject.getElectiveList()) );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// ProcLaterality
		ims.domain.lookups.LookupInstance instance6 = domainObject.getProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup6 = new ims.core.vo.lookups.LateralityLRB(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.LateralityLRB(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setProcLaterality(voLookup6);
		}
				// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// SecondaryProcLaterality
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSecondaryProcLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup8 = new ims.core.vo.lookups.LateralityLRB(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.LateralityLRB(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSecondaryProcLaterality(voLookup8);
		}
				// WLAnaestheticType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getWLAnaestheticType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.AnaestheticType voLookup9 = new ims.clinical.vo.lookups.AnaestheticType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setWLAnaestheticType(voLookup9);
		}
				// hasPacemakerDefib
		valueObject.setHasPacemakerDefib( domainObject.isHasPacemakerDefib() );
		// PatientReceivingAnticoagulantTherapy
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPatientReceivingAnticoagulantTherapy();
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

			ims.core.vo.lookups.YesNoUnknown voLookup11 = new ims.core.vo.lookups.YesNoUnknown(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.YesNoUnknown(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPatientReceivingAnticoagulantTherapy(voLookup11);
		}
				// WLPatientReceivingAnticoagulantTherapy
		ims.domain.lookups.LookupInstance instance12 = domainObject.getWLPatientReceivingAnticoagulantTherapy();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNoUnknown voLookup12 = new ims.core.vo.lookups.YesNoUnknown(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNoUnknown(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setWLPatientReceivingAnticoagulantTherapy(voLookup12);
		}
				// AvailableAtShortNotice
		valueObject.setAvailableAtShortNotice( domainObject.isAvailableAtShortNotice() );
		// WLAvailableAtShortNotice
		valueObject.setWLAvailableAtShortNotice( domainObject.isWLAvailableAtShortNotice() );
		// AvailableAtShortNoticePeriod
		valueObject.setAvailableAtShortNoticePeriod(domainObject.getAvailableAtShortNoticePeriod());
		// WLAvailableAtShortNoticePeriod
		valueObject.setWLAvailableAtShortNoticePeriod(domainObject.getWLAvailableAtShortNoticePeriod());
		// PreOperativeOvernightStayRequired
		valueObject.setPreOperativeOvernightStayRequired( domainObject.isPreOperativeOvernightStayRequired() );
		// WLPreOperativeOvernightStayRequired
		valueObject.setWLPreOperativeOvernightStayRequired( domainObject.isWLPreOperativeOvernightStayRequired() );
		// NoOfPreOperativeNights
		valueObject.setNoOfPreOperativeNights(domainObject.getNoOfPreOperativeNights());
		// WLNoOfPreOperativeNights
		valueObject.setWLNoOfPreOperativeNights(domainObject.getWLNoOfPreOperativeNights());
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// WLAnticipatedStay
		valueObject.setWLAnticipatedStay(domainObject.getWLAnticipatedStay());
		// RequiredTheatreType
		ims.domain.lookups.LookupInstance instance23 = domainObject.getRequiredTheatreType();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.TheatreType voLookup23 = new ims.scheduling.vo.lookups.TheatreType(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.scheduling.vo.lookups.TheatreType(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setRequiredTheatreType(voLookup23);
		}
				// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// ElectiveListStatusHistory
		valueObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.createElectiveListStatusVoCollectionFromElectiveListStatus(map, domainObject.getElectiveListStatusHistory()) );
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance26 = domainObject.getElectiveAdmissionType();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup26 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup26);
		}
				// CriticalCareBedRequired
		valueObject.setCriticalCareBedRequired( domainObject.isCriticalCareBedRequired() );
		// AnaestheticType
		ims.domain.lookups.LookupInstance instance28 = domainObject.getAnaestheticType();
		if ( null != instance28 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance28.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance28.getImage().getImageId(), instance28.getImage().getImagePath());
			}
			color = instance28.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.AnaestheticType voLookup28 = new ims.clinical.vo.lookups.AnaestheticType(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup28 = voLookup28;
			ims.domain.lookups.LookupInstance parent28 = instance28.getParent();
			while (parent28 != null)
			{
				if (parent28.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent28.getImage().getImageId(), parent28.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent28.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup28.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setAnaestheticType(voLookup28);
		}
				// Hospital
		if (domainObject.getHospital() != null)
		{
			if(domainObject.getHospital() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getHospital();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setHospital(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setHospital(new ims.core.resource.place.vo.LocationRefVo(domainObject.getHospital().getId(), domainObject.getHospital().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientElectiveList();
		ims.RefMan.domain.objects.PatientElectiveList domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(valueObject);
			}
			// ims.RefMan.vo.PatientElectiveListForPreassessmentOutcVo ID_PatientElectiveList field is unknown
			domainObject = new ims.RefMan.domain.objects.PatientElectiveList();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientElectiveList());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientElectiveList.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientElectiveList());

		domainObject.setPreAssessmentOutcome(ims.RefMan.vo.domain.PreAssessmentOutcomeVoAssembler.extractPreAssessmentOutcome(domainFactory, valueObject.getPreAssessmentOutcome(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getFitForSurgery() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getFitForSurgery().getID());
		}
		domainObject.setFitForSurgery(value2);
		ims.core.patient.domain.objects.Patient value3 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value3 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getPatient();	
			}
			else
			{
				value3 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value3);
		domainObject.setElectiveList(ims.admin.vo.domain.ElectiveListConfigurationVoAssembler.extractElectiveListConfiguration(domainFactory, valueObject.getElectiveList(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value5 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getProcLaterality() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getProcLaterality().getID());
		}
		domainObject.setProcLaterality(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value7 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value7 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else
			{
				value7 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSecondaryProcLaterality() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSecondaryProcLaterality().getID());
		}
		domainObject.setSecondaryProcLaterality(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getWLAnaestheticType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getWLAnaestheticType().getID());
		}
		domainObject.setWLAnaestheticType(value9);
		domainObject.setHasPacemakerDefib(valueObject.getHasPacemakerDefib());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPatientReceivingAnticoagulantTherapy() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPatientReceivingAnticoagulantTherapy().getID());
		}
		domainObject.setPatientReceivingAnticoagulantTherapy(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getWLPatientReceivingAnticoagulantTherapy() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getWLPatientReceivingAnticoagulantTherapy().getID());
		}
		domainObject.setWLPatientReceivingAnticoagulantTherapy(value12);
		domainObject.setAvailableAtShortNotice(valueObject.getAvailableAtShortNotice());
		domainObject.setWLAvailableAtShortNotice(valueObject.getWLAvailableAtShortNotice());
		domainObject.setAvailableAtShortNoticePeriod(valueObject.getAvailableAtShortNoticePeriod());
		domainObject.setWLAvailableAtShortNoticePeriod(valueObject.getWLAvailableAtShortNoticePeriod());
		domainObject.setPreOperativeOvernightStayRequired(valueObject.getPreOperativeOvernightStayRequired());
		domainObject.setWLPreOperativeOvernightStayRequired(valueObject.getWLPreOperativeOvernightStayRequired());
		domainObject.setNoOfPreOperativeNights(valueObject.getNoOfPreOperativeNights());
		domainObject.setWLNoOfPreOperativeNights(valueObject.getWLNoOfPreOperativeNights());
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		domainObject.setWLAnticipatedStay(valueObject.getWLAnticipatedStay());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getRequiredTheatreType() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getRequiredTheatreType().getID());
		}
		domainObject.setRequiredTheatreType(value23);
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));
		domainObject.setElectiveListStatusHistory(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatusList(domainFactory, valueObject.getElectiveListStatusHistory(), domainObject.getElectiveListStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value26);
		domainObject.setCriticalCareBedRequired(valueObject.getCriticalCareBedRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value28);
		ims.core.resource.place.domain.objects.Location value29 = null;
		if ( null != valueObject.getHospital() ) 
		{
			if (valueObject.getHospital().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospital()) != null)
				{
					value29 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getHospital());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value29 = domainObject.getHospital();	
			}
			else
			{
				value29 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getHospital().getBoId());
			}
		}
		domainObject.setHospital(value29);

		return domainObject;
	}

}
