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
public class DischargeDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.DischargeDetailsVo copy(ims.clinical.vo.DischargeDetailsVo valueObjectDest, ims.clinical.vo.DischargeDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargeDetails(valueObjectSrc.getID_DischargeDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createDischargeDetailsVoCollectionFromDischargeDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsVoCollection createDischargeDetailsVoCollectionFromDischargeDetails(java.util.Set domainObjectSet)	
	{
		return createDischargeDetailsVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsVoCollection createDischargeDetailsVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.DischargeDetailsVoCollection voList = new ims.clinical.vo.DischargeDetailsVoCollection();
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
			ims.clinical.vo.DischargeDetailsVo vo = create(map, domainObject);
			
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
	public static ims.clinical.vo.DischargeDetailsVoCollection createDischargeDetailsVoCollectionFromDischargeDetails(java.util.List domainObjectList) 
	{
		return createDischargeDetailsVoCollectionFromDischargeDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.DischargeDetails objects.
	 */
	public static ims.clinical.vo.DischargeDetailsVoCollection createDischargeDetailsVoCollectionFromDischargeDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.DischargeDetailsVoCollection voList = new ims.clinical.vo.DischargeDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.DischargeDetails domainObject = (ims.edischarge.domain.objects.DischargeDetails) domainObjectList.get(i);
			ims.clinical.vo.DischargeDetailsVo vo = create(map, domainObject);

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
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargeDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVoCollection voCollection) 
	 {
	 	return extractDischargeDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargeDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.DischargeDetailsVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.DischargeDetails domainObject = DischargeDetailsVoAssembler.extractDischargeDetails(domainFactory, vo, domMap);

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
	 public static ims.clinical.vo.DischargeDetailsVo create(ims.edischarge.domain.objects.DischargeDetails domainObject) 
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
	  public static ims.clinical.vo.DischargeDetailsVo create(DomainObjectMap map, ims.edischarge.domain.objects.DischargeDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.DischargeDetailsVo valueObject = (ims.clinical.vo.DischargeDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.DischargeDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.DischargeDetailsVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.clinical.vo.DischargeDetailsVo insert(ims.clinical.vo.DischargeDetailsVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
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
	 public static ims.clinical.vo.DischargeDetailsVo insert(DomainObjectMap map, ims.clinical.vo.DischargeDetailsVo valueObject, ims.edischarge.domain.objects.DischargeDetails domainObject) 
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
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDischargeMethod();
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

			ims.core.vo.lookups.DischargeMethod voLookup3 = new ims.core.vo.lookups.DischargeMethod(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.DischargeMethod parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.DischargeMethod(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDischargeMethod(voLookup3);
		}
				// DischargeDestination
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDischargeDestination();
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

			ims.coe.vo.lookups.DischargeDestination voLookup4 = new ims.coe.vo.lookups.DischargeDestination(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.coe.vo.lookups.DischargeDestination(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDischargeDestination(voLookup4);
		}
				// DischargingWard
		valueObject.setDischargingWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getDischargingWard()) );
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// InitiatingHCP
		valueObject.setInitiatingHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getInitiatingHCP()) );
		// DischargeLetterStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDischargeLetterStatus();
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

			ims.clinical.vo.lookups.DischargeLetterStatus voLookup8 = new ims.clinical.vo.lookups.DischargeLetterStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeLetterStatus parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.DischargeLetterStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDischargeLetterStatus(voLookup8);
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
		ims.domain.lookups.LookupInstance instance13 = domainObject.getDischargingSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup13 = new ims.core.vo.lookups.Specialty(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.Specialty(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setDischargingSpecialty(voLookup13);
		}
				// DischargeSupplementaryLetterStatus
		ims.domain.lookups.LookupInstance instance14 = domainObject.getDischargeSupplementaryLetterStatus();
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

			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus voLookup14 = new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.clinical.vo.lookups.DischargeSupplementaryLetterStatus(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setDischargeSupplementaryLetterStatus(voLookup14);
		}
				// NurseEnabledInstructions
		valueObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.create(map, domainObject.getNurseEnabledInstructions()) );
		// hasNoDiagnosis
		valueObject.setHasNoDiagnosis( domainObject.isHasNoDiagnosis() );
		// MethodOfDischarge
		ims.domain.lookups.LookupInstance instance17 = domainObject.getMethodOfDischarge();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MethodOfDischarge voLookup17 = new ims.core.vo.lookups.MethodOfDischarge(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfDischarge parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.core.vo.lookups.MethodOfDischarge(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setMethodOfDischarge(voLookup17);
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
	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVo valueObject) 
	{
		return 	extractDischargeDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.DischargeDetails extractDischargeDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.DischargeDetailsVo valueObject, HashMap domMap) 
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
			// ims.clinical.vo.DischargeDetailsVo ID_DischargeDetails field is unknown
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

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getDateOfDischarge();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setDateOfDischarge(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDischargeMethod() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDischargeMethod().getID());
		}
		domainObject.setDischargeMethod(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getDischargingWard() ) 
		{
			if (valueObject.getDischargingWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingWard()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDischargingWard());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDischargingWard().getBoId());
			}
		}
		domainObject.setDischargingWard(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getInitiatingHCP() ) 
		{
			if (valueObject.getInitiatingHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getInitiatingHCP()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getInitiatingHCP());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getInitiatingHCP().getBoId());
			}
		}
		domainObject.setInitiatingHCP(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDischargeLetterStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDischargeLetterStatus().getID());
		}
		domainObject.setDischargeLetterStatus(value8);
		domainObject.setHasNoComplications(valueObject.getHasNoComplications());
		domainObject.setHasNoComorbidities(valueObject.getHasNoComorbidities());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value11 = null;
		if ( null != valueObject.getDischargingConsultant() ) 
		{
			if (valueObject.getDischargingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingConsultant()) != null)
				{
					value11 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getDischargingConsultant());
				}
			}
			else
			{
				value11 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getDischargingConsultant().getBoId());
			}
		}
		domainObject.setDischargingConsultant(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value12 = null;
		if ( null != valueObject.getSecondaryDischargingConsultant() ) 
		{
			if (valueObject.getSecondaryDischargingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getSecondaryDischargingConsultant()) != null)
				{
					value12 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSecondaryDischargingConsultant());
				}
			}
			else
			{
				value12 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSecondaryDischargingConsultant().getBoId());
			}
		}
		domainObject.setSecondaryDischargingConsultant(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getDischargingSpecialty() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getDischargingSpecialty().getID());
		}
		domainObject.setDischargingSpecialty(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getDischargeSupplementaryLetterStatus() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getDischargeSupplementaryLetterStatus().getID());
		}
		domainObject.setDischargeSupplementaryLetterStatus(value14);
		domainObject.setNurseEnabledInstructions(ims.clinical.vo.domain.NurseEnabledInstructionsVoAssembler.extractNurseEnabledInstructions(domainFactory, valueObject.getNurseEnabledInstructions(), domMap));
		domainObject.setHasNoDiagnosis(valueObject.getHasNoDiagnosis());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getMethodOfDischarge() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getMethodOfDischarge().getID());
		}
		domainObject.setMethodOfDischarge(value17);
		domainObject.setIsDiagnosisComplete(valueObject.getIsDiagnosisComplete());

		return domainObject;
	}

}
