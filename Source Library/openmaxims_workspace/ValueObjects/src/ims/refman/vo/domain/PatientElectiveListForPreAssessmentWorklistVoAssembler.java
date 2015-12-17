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
 * @author Florin Blindu
 */
public class PatientElectiveListForPreAssessmentWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo copy(ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObjectDest, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// OtherProcedures
		valueObjectDest.setOtherProcedures(valueObjectSrc.getOtherProcedures());
		// PreAssessmentOutcome
		valueObjectDest.setPreAssessmentOutcome(valueObjectSrc.getPreAssessmentOutcome());
		// SecondaryProcedure
		valueObjectDest.setSecondaryProcedure(valueObjectSrc.getSecondaryProcedure());
		// PreAssessmentRequired
		valueObjectDest.setPreAssessmentRequired(valueObjectSrc.getPreAssessmentRequired());
		// isSuitableForTelephoneAssessment
		valueObjectDest.setIsSuitableForTelephoneAssessment(valueObjectSrc.getIsSuitableForTelephoneAssessment());
		// PreAssessmentAppointment
		valueObjectDest.setPreAssessmentAppointment(valueObjectSrc.getPreAssessmentAppointment());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voList = new ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection();
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
			ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection createPatientElectiveListForPreAssessmentWorklistVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voList = new ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForPreAssessmentWorklistVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListForPreAssessmentWorklistVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObject = (ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo insert(ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
		// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.CatsRefForPreassessmentWorklistVoAssembler.create(map, domainObject.getReferral()) );
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureNameVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// OtherProcedures
		valueObject.setOtherProcedures(ims.core.vo.domain.ProcedureNameVoAssembler.createProcedureNameVoCollectionFromProcedure(map, domainObject.getOtherProcedures()) );
		// PreAssessmentOutcome
		valueObject.setPreAssessmentOutcome(ims.RefMan.vo.domain.PreAssessmentOutcomeForWorklistVoAssembler.create(map, domainObject.getPreAssessmentOutcome()) );
		// SecondaryProcedure
		valueObject.setSecondaryProcedure(ims.core.vo.domain.ProcedureNameVoAssembler.create(map, domainObject.getSecondaryProcedure()) );
		// PreAssessmentRequired
		valueObject.setPreAssessmentRequired( domainObject.isPreAssessmentRequired() );
		// isSuitableForTelephoneAssessment
		valueObject.setIsSuitableForTelephoneAssessment( domainObject.isIsSuitableForTelephoneAssessment() );
		// PreAssessmentAppointment
		valueObject.setPreAssessmentAppointment(ims.RefMan.vo.domain.BookAppointmentForPreAssessmentWorklistVoAssembler.create(map, domainObject.getPreAssessmentAppointment()) );
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getElectiveAdmissionType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup10 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup10);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListForPreAssessmentWorklistVo ID_PatientElectiveList field is unknown
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
	ims.RefMan.domain.objects.CatsReferral value2 = null;
		if ( null != valueObject.getReferral() ) 
		{
			if (valueObject.getReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getReferral()) != null)
				{
					value2 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getReferral());
				}
			}
			else
			{
				value2 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getReferral().getBoId());
			}
		}
		domainObject.setReferral(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value3 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ProcedureRefVoCollection refCollection4 = new ims.core.clinical.vo.ProcedureRefVoCollection();
		if (valueObject.getOtherProcedures() != null)
		{
			for (int i4=0; i4<valueObject.getOtherProcedures().size(); i4++)
			{
				ims.core.clinical.vo.ProcedureRefVo ref4 = (ims.core.clinical.vo.ProcedureRefVo)valueObject.getOtherProcedures().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.List domainOtherProcedures4 = domainObject.getOtherProcedures();
		if (domainOtherProcedures4 == null)
		{
			domainOtherProcedures4 = new java.util.ArrayList();
		}
		for(int i=0; i < size4; i++) 
		{
			ims.core.clinical.vo.ProcedureRefVo vo = refCollection4.get(i);			
			ims.core.clinical.domain.objects.Procedure dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Procedure)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Procedure.class, vo.getBoId());
				}
			}

			int domIdx = domainOtherProcedures4.indexOf(dom);
			if (domIdx == -1)
			{
				domainOtherProcedures4.add(i, dom);
			}
			else if (i != domIdx && i < domainOtherProcedures4.size())
			{
				Object tmp = domainOtherProcedures4.get(i);
				domainOtherProcedures4.set(i, domainOtherProcedures4.get(domIdx));
				domainOtherProcedures4.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i4 = domainOtherProcedures4.size();
		while (i4 > size4)
		{
			domainOtherProcedures4.remove(i4-1);
			i4 = domainOtherProcedures4.size();
		}
		
		domainObject.setOtherProcedures(domainOtherProcedures4);		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.PreAssessmentOutcome value5 = null;
		if ( null != valueObject.getPreAssessmentOutcome() ) 
		{
			if (valueObject.getPreAssessmentOutcome().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreAssessmentOutcome()) != null)
				{
					value5 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domMap.get(valueObject.getPreAssessmentOutcome());
				}
			}
			else
			{
				value5 = (ims.RefMan.domain.objects.PreAssessmentOutcome)domainFactory.getDomainObject(ims.RefMan.domain.objects.PreAssessmentOutcome.class, valueObject.getPreAssessmentOutcome().getBoId());
			}
		}
		domainObject.setPreAssessmentOutcome(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value6 = null;
		if ( null != valueObject.getSecondaryProcedure() ) 
		{
			if (valueObject.getSecondaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryProcedure()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getSecondaryProcedure());
				}
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getSecondaryProcedure().getBoId());
			}
		}
		domainObject.setSecondaryProcedure(value6);
		domainObject.setPreAssessmentRequired(valueObject.getPreAssessmentRequired());
		domainObject.setIsSuitableForTelephoneAssessment(valueObject.getIsSuitableForTelephoneAssessment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value9 = null;
		if ( null != valueObject.getPreAssessmentAppointment() ) 
		{
			if (valueObject.getPreAssessmentAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getPreAssessmentAppointment()) != null)
				{
					value9 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getPreAssessmentAppointment());
				}
			}
			else
			{
				value9 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getPreAssessmentAppointment().getBoId());
			}
		}
		domainObject.setPreAssessmentAppointment(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value10);

		return domainObject;
	}

}
