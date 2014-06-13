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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class DischargeDetailsWithAssessmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeDetailsWithAssessmentVo copy(ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObjectDest, ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeDetails(valueObjectSrc.getID_DischargeDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PatientAssessment
		valueObjectDest.setPatientAssessment(valueObjectSrc.getPatientAssessment());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// DateOfDischarge
		valueObjectDest.setDateOfDischarge(valueObjectSrc.getDateOfDischarge());
		// DischargeMethod
		valueObjectDest.setDischargeMethod(valueObjectSrc.getDischargeMethod());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// DischargingWard
		valueObjectDest.setDischargingWard(valueObjectSrc.getDischargingWard());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// InitiatingHCP
		valueObjectDest.setInitiatingHCP(valueObjectSrc.getInitiatingHCP());
		// DischargeLetterStatus
		valueObjectDest.setDischargeLetterStatus(valueObjectSrc.getDischargeLetterStatus());
		// hasNoComplications
		valueObjectDest.setHasNoComplications(valueObjectSrc.getHasNoComplications());
		// hasNoComorbidities
		valueObjectDest.setHasNoComorbidities(valueObjectSrc.getHasNoComorbidities());
		// DischargingConsultant
		valueObjectDest.setDischargingConsultant(valueObjectSrc.getDischargingConsultant());
		// SecondaryDischargingConsultant
		valueObjectDest.setSecondaryDischargingConsultant(valueObjectSrc.getSecondaryDischargingConsultant());
		// DischargingSpecialty
		valueObjectDest.setDischargingSpecialty(valueObjectSrc.getDischargingSpecialty());
		// DischargeSupplementaryLetterStatus
		valueObjectDest.setDischargeSupplementaryLetterStatus(valueObjectSrc.getDischargeSupplementaryLetterStatus());
		// NurseEnabledInstructions
		valueObjectDest.setNurseEnabledInstructions(valueObjectSrc.getNurseEnabledInstructions());
		// hasNoDiagnosis
		valueObjectDest.setHasNoDiagnosis(valueObjectSrc.getHasNoDiagnosis());
		// MethodOfDischarge
		valueObjectDest.setMethodOfDischarge(valueObjectSrc.getMethodOfDischarge());
		// isDiagnosisComplete
		valueObjectDest.setIsDiagnosisComplete(valueObjectSrc.getIsDiagnosisComplete());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(java.util.Set domainObjectSet)	
	{
		return createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voList = new ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.DischargeDetails domainObject = (ims.edischarge.domain.objects.DischargeDetails) iterator.next();
			ims.clinical.vo.DischargeDetailsWithAssessmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(java.util.List domainObjectList) 
	{
		return createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection createDischargeDetailsWithAssessmentVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voList = new ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.DischargeDetails domainObject = (ims.edischarge.domain.objects.DischargeDetails) domainObjectList.get(i);
			ims.clinical.vo.DischargeDetailsWithAssessmentVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.DischargeDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsWithAssessmentVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsWithAssessmentVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.DischargeDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsWithAssessmentVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsWithAssessmentVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.DischargeDetails object.
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsWithAssessmentVo create(ims.edischarge.domain.objects.DischargeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.DischargeDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.DischargeDetailsWithAssessmentVo create(DomainObjectMap map, ims.edischarge.domain.objects.DischargeDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObject = (ims.clinical.vo.DischargeDetailsWithAssessmentVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeDetailsWithAssessmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeDetailsWithAssessmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsWithAssessmentVo insert(ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.DischargeDetails
	 */
	 public static ims.clinical.vo.DischargeDetailsWithAssessmentVo insert(DomainObjectMap map, ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargeDetails(domainObject.getId());
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
			
		// PatientAssessment
		valueObject.setPatientAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getPatientAssessment()) );
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
		// DateOfDischarge
		java.util.Date DateOfDischarge = domainObject.getDateOfDischarge();
		if ( null != DateOfDischarge ) 
		{
			valueObject.setDateOfDischarge(new ims.framework.utils.DateTime(DateOfDischarge) );
		}
		// DischargeMethod
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDischargeMethod();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DischargeMethod voLookup4 = new ims.core.vo.lookups.DischargeMethod(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.DischargeMethod parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.DischargeMethod(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDischargeMethod(voLookup4);
		}
				// DischargeDestination
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDischargeDestination();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.coe.vo.lookups.DischargeDestination voLookup5 = new ims.coe.vo.lookups.DischargeDestination(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.coe.vo.lookups.DischargeDestination(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDischargeDestination(voLookup5);
		}
				// DischargingWard
		valueObject.setDischargingWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getDischargingWard()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// InitiatingHCP
		valueObject.setInitiatingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getInitiatingHCP()) );
		// DischargeLetterStatus
		ims.domain.lookups.LookupInstance instance9 = domainObject.getDischargeLetterStatus();
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

			ims.clinical.vo.lookups.DischargeLetterStatus voLookup9 = new ims.clinical.vo.lookups.DischargeLetterStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeLetterStatus parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.clinical.vo.lookups.DischargeLetterStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setDischargeLetterStatus(voLookup9);
		}
				// hasNoComplications
		valueObject.setHasNoComplications( domainObject.isHasNoComplications() );
		// hasNoComorbidities
		valueObject.setHasNoComorbidities( domainObject.isHasNoComorbidities() );
		// DischargingConsultant
		valueObject.setDischargingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getDischargingConsultant()) );
		// SecondaryDischargingConsultant
		valueObject.setSecondaryDischargingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSecondaryDischargingConsultant()) );
		// DischargingSpecialty
		ims.domain.lookups.LookupInstance instance14 = domainObject.getDischargingSpecialty();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup14 = new ims.core.vo.lookups.Specialty(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.Specialty(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setDischargingSpecialty(voLookup14);
		}
				// DischargeSupplementaryLetterStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getDischargeSupplementaryLetterStatus();
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

			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus voLookup15 = new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setDischargeSupplementaryLetterStatus(voLookup15);
		}
				// NurseEnabledInstructions
		valueObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.create(map, domainObject.getNurseEnabledInstructions()) );
		// hasNoDiagnosis
		valueObject.setHasNoDiagnosis( domainObject.isHasNoDiagnosis() );
		// MethodOfDischarge
		ims.domain.lookups.LookupInstance instance18 = domainObject.getMethodOfDischarge();
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

			ims.core.vo.lookups.MethodOfDischarge voLookup18 = new ims.core.vo.lookups.MethodOfDischarge(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfDischarge parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.MethodOfDischarge(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setMethodOfDischarge(voLookup18);
		}
				// isDiagnosisComplete
		valueObject.setIsDiagnosisComplete( domainObject.isIsDiagnosisComplete() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObject) 
	{
		return 	extractDischargeDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsWithAssessmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargeDetails();
		ims.edischarge.domain.objects.DischargeDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.DischargeDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.DischargeDetailsWithAssessmentVo ID_DischargeDetails field is unknown
			domainObject = new ims.edischarge.domain.objects.DischargeDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargeDetails());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.DischargeDetails)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.DischargeDetails) domainFactory.getDomainObject(ims.edischarge.domain.objects.DischargeDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargeDetails());

		domainObject.setPatientAssessment(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getPatientAssessment(), domMap));
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getDateOfDischarge();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDateOfDischarge(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDischargeMethod() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDischargeMethod().getID());
		}
		domainObject.setDischargeMethod(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value6 = null;
		if ( null != valueObject.getDischargingWard() ) 
		{
			if (valueObject.getDischargingWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingWard()) != null)
				{
					value6 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDischargingWard());
				}
			}
			else
			{
				value6 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDischargingWard().getBoId());
			}
		}
		domainObject.setDischargingWard(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value8 = null;
		if ( null != valueObject.getInitiatingHCP() ) 
		{
			if (valueObject.getInitiatingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getInitiatingHCP()) != null)
				{
					value8 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getInitiatingHCP());
				}
			}
			else
			{
				value8 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getInitiatingHCP().getBoId());
			}
		}
		domainObject.setInitiatingHCP(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getDischargeLetterStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getDischargeLetterStatus().getID());
		}
		domainObject.setDischargeLetterStatus(value9);
		domainObject.setHasNoComplications(valueObject.getHasNoComplications());
		domainObject.setHasNoComorbidities(valueObject.getHasNoComorbidities());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getDischargingConsultant() ) 
		{
			if (valueObject.getDischargingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingConsultant()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getDischargingConsultant());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getDischargingConsultant().getBoId());
			}
		}
		domainObject.setDischargingConsultant(value12);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value13 = null;
		if ( null != valueObject.getSecondaryDischargingConsultant() ) 
		{
			if (valueObject.getSecondaryDischargingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryDischargingConsultant()) != null)
				{
					value13 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSecondaryDischargingConsultant());
				}
			}
			else
			{
				value13 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSecondaryDischargingConsultant().getBoId());
			}
		}
		domainObject.setSecondaryDischargingConsultant(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getDischargingSpecialty() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getDischargingSpecialty().getID());
		}
		domainObject.setDischargingSpecialty(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getDischargeSupplementaryLetterStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getDischargeSupplementaryLetterStatus().getID());
		}
		domainObject.setDischargeSupplementaryLetterStatus(value15);
		domainObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.extractNurseEnabledInstructions(domainFactory, valueObject.getNurseEnabledInstructions(), domMap));
		domainObject.setHasNoDiagnosis(valueObject.getHasNoDiagnosis());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getMethodOfDischarge() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getMethodOfDischarge().getID());
		}
		domainObject.setMethodOfDischarge(value18);
		domainObject.setIsDiagnosisComplete(valueObject.getIsDiagnosisComplete());

		return domainObject;
	}

}
