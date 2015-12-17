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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Brendan Woods
 */
public class VitalSignsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VitalSignsVo copy(ims.core.vo.VitalSignsVo valueObjectDest, ims.core.vo.VitalSignsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_VitalSigns(valueObjectSrc.getID_VitalSigns());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BloodPressure
		valueObjectDest.setBloodPressure(valueObjectSrc.getBloodPressure());
		// Pulse
		valueObjectDest.setPulse(valueObjectSrc.getPulse());
		// Respiratory
		valueObjectDest.setRespiratory(valueObjectSrc.getRespiratory());
		// Temperature
		valueObjectDest.setTemperature(valueObjectSrc.getTemperature());
		// GlasgowComaScale
		valueObjectDest.setGlasgowComaScale(valueObjectSrc.getGlasgowComaScale());
		// OxygenSaturation
		valueObjectDest.setOxygenSaturation(valueObjectSrc.getOxygenSaturation());
		// BloodSugar
		valueObjectDest.setBloodSugar(valueObjectSrc.getBloodSugar());
		// Pupils
		valueObjectDest.setPupils(valueObjectSrc.getPupils());
		// VisualAcuity
		valueObjectDest.setVisualAcuity(valueObjectSrc.getVisualAcuity());
		// Metrics
		valueObjectDest.setMetrics(valueObjectSrc.getMetrics());
		// ArterialBloodGas
		valueObjectDest.setArterialBloodGas(valueObjectSrc.getArterialBloodGas());
		// VentilationChart
		valueObjectDest.setVentilationChart(valueObjectSrc.getVentilationChart());
		// RecordedSigns
		valueObjectDest.setRecordedSigns(valueObjectSrc.getRecordedSigns());
		// LungFunctionTest
		valueObjectDest.setLungFunctionTest(valueObjectSrc.getLungFunctionTest());
		// Pain
		valueObjectDest.setPain(valueObjectSrc.getPain());
		// PatientConscious
		valueObjectDest.setPatientConscious(valueObjectSrc.getPatientConscious());
		// Urine2mlkgkhr
		valueObjectDest.setUrine2mlkgkhr(valueObjectSrc.getUrine2mlkgkhr());
		// PatientCausingConcern
		valueObjectDest.setPatientCausingConcern(valueObjectSrc.getPatientCausingConcern());
		// RecordingInformation
		valueObjectDest.setRecordingInformation(valueObjectSrc.getRecordingInformation());
		// IsVentilationChartRecord
		valueObjectDest.setIsVentilationChartRecord(valueObjectSrc.getIsVentilationChartRecord());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// VitalsTakenDateTime
		valueObjectDest.setVitalsTakenDateTime(valueObjectSrc.getVitalsTakenDateTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVitalSignsVoCollectionFromVitalSigns(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsVoCollection createVitalSignsVoCollectionFromVitalSigns(java.util.Set domainObjectSet)	
	{
		return createVitalSignsVoCollectionFromVitalSigns(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsVoCollection createVitalSignsVoCollectionFromVitalSigns(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VitalSignsVoCollection voList = new ims.core.vo.VitalSignsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.VitalSigns domainObject = (ims.core.vitals.domain.objects.VitalSigns) iterator.next();
			ims.core.vo.VitalSignsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsVoCollection createVitalSignsVoCollectionFromVitalSigns(java.util.List domainObjectList) 
	{
		return createVitalSignsVoCollectionFromVitalSigns(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.VitalSigns objects.
	 */
	public static ims.core.vo.VitalSignsVoCollection createVitalSignsVoCollectionFromVitalSigns(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VitalSignsVoCollection voList = new ims.core.vo.VitalSignsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.VitalSigns domainObject = (ims.core.vitals.domain.objects.VitalSigns) domainObjectList.get(i);
			ims.core.vo.VitalSignsVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.VitalSigns set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractVitalSignsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVoCollection voCollection) 
	 {
	 	return extractVitalSignsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractVitalSignsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignsVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VitalSigns domainObject = VitalSignsVoAssembler.extractVitalSigns(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.VitalSigns list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractVitalSignsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVoCollection voCollection) 
	 {
	 	return extractVitalSignsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractVitalSignsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VitalSignsVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.VitalSigns domainObject = VitalSignsVoAssembler.extractVitalSigns(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.VitalSigns object.
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsVo create(ims.core.vitals.domain.objects.VitalSigns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.VitalSigns object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VitalSignsVo create(DomainObjectMap map, ims.core.vitals.domain.objects.VitalSigns domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VitalSignsVo valueObject = (ims.core.vo.VitalSignsVo) map.getValueObject(domainObject, ims.core.vo.VitalSignsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VitalSignsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsVo insert(ims.core.vo.VitalSignsVo valueObject, ims.core.vitals.domain.objects.VitalSigns domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.VitalSigns
	 */
	 public static ims.core.vo.VitalSignsVo insert(DomainObjectMap map, ims.core.vo.VitalSignsVo valueObject, ims.core.vitals.domain.objects.VitalSigns domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_VitalSigns(domainObject.getId());
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
			
		// BloodPressure
		valueObject.setBloodPressure(ims.core.vo.domain.VSBloodPressureAssembler.create(map, domainObject.getBloodPressure()) );
		// Pulse
		valueObject.setPulse(ims.core.vo.domain.VSPulseAssembler.create(map, domainObject.getPulse()) );
		// Respiratory
		valueObject.setRespiratory(ims.core.vo.domain.VSRespirationsAssembler.create(map, domainObject.getRespiratory()) );
		// Temperature
		valueObject.setTemperature(ims.core.vo.domain.VSTemperatureAssembler.create(map, domainObject.getTemperature()) );
		// GlasgowComaScale
		valueObject.setGlasgowComaScale(ims.core.vo.domain.VSGlasgowComaScaleAssembler.create(map, domainObject.getGlasgowComaScale()) );
		// OxygenSaturation
		valueObject.setOxygenSaturation(ims.core.vo.domain.VSOxygenSaturationAssembler.create(map, domainObject.getOxygenSaturation()) );
		// BloodSugar
		valueObject.setBloodSugar(ims.core.vo.domain.VSBloodSugarAssembler.create(map, domainObject.getBloodSugar()) );
		// Pupils
		valueObject.setPupils(ims.core.vo.domain.VSPupilsAssembler.create(map, domainObject.getPupils()) );
		// VisualAcuity
		valueObject.setVisualAcuity(ims.core.vo.domain.VSVisualAcuityAssembler.create(map, domainObject.getVisualAcuity()) );
		// Metrics
		valueObject.setMetrics(ims.core.vo.domain.VSMetricsAssembler.create(map, domainObject.getMetrics()) );
		// ArterialBloodGas
		valueObject.setArterialBloodGas(ims.core.vo.domain.VSArterialBloodGasAssembler.create(map, domainObject.getArterialBloodGas()) );
		// VentilationChart
		valueObject.setVentilationChart(ims.core.vo.domain.VSVentilationChartVoAssembler.create(map, domainObject.getVentilationChart()) );
		// RecordedSigns
		java.util.List listRecordedSigns = domainObject.getRecordedSigns();
		ims.core.vo.lookups.VSTypeCollection RecordedSigns = new ims.core.vo.lookups.VSTypeCollection();
		for(java.util.Iterator iterator = listRecordedSigns.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.VSType voInstance = new ims.core.vo.lookups.VSType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.VSType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.VSType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			RecordedSigns.add(voInstance);
		}
		valueObject.setRecordedSigns( RecordedSigns );
		// LungFunctionTest
		valueObject.setLungFunctionTest(ims.core.vo.domain.VSLungFunctionTestVoAssembler.create(map, domainObject.getLungFunctionTest()) );
		// Pain
		valueObject.setPain(ims.core.vo.domain.VSPainLadderVoAssembler.create(map, domainObject.getPain()) );
		// PatientConscious
		ims.domain.lookups.LookupInstance instance16 = domainObject.getPatientConscious();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ConsciousLevel voLookup16 = new ims.core.vo.lookups.ConsciousLevel(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.ConsciousLevel parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.core.vo.lookups.ConsciousLevel(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setPatientConscious(voLookup16);
		}
				// Urine2mlkgkhr
		ims.domain.lookups.LookupInstance instance17 = domainObject.getUrine2mlkgkhr();
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

			ims.core.vo.lookups.UrineOutput voLookup17 = new ims.core.vo.lookups.UrineOutput(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.UrineOutput parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.UrineOutput(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setUrine2mlkgkhr(voLookup17);
		}
				// PatientCausingConcern
		ims.domain.lookups.LookupInstance instance18 = domainObject.getPatientCausingConcern();
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

			ims.core.vo.lookups.PatientCausingConcern voLookup18 = new ims.core.vo.lookups.PatientCausingConcern(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.PatientCausingConcern parentVoLookup18 = voLookup18;
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
								parentVoLookup18.setParent(new ims.core.vo.lookups.PatientCausingConcern(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setPatientCausingConcern(voLookup18);
		}
				// RecordingInformation
		valueObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInformation()) );
		// IsVentilationChartRecord
		valueObject.setIsVentilationChartRecord( domainObject.isIsVentilationChartRecord() );
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// VitalsTakenDateTime
		java.util.Date VitalsTakenDateTime = domainObject.getVitalsTakenDateTime();
		if ( null != VitalsTakenDateTime ) 
		{
			valueObject.setVitalsTakenDateTime(new ims.framework.utils.DateTime(VitalsTakenDateTime) );
		}
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
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.VitalSigns extractVitalSigns(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVo valueObject) 
	{
		return 	extractVitalSigns(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.VitalSigns extractVitalSigns(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VitalSignsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_VitalSigns();
		ims.core.vitals.domain.objects.VitalSigns domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.VitalSigns)domMap.get(valueObject);
			}
			// ims.core.vo.VitalSignsVo ID_VitalSigns field is unknown
			domainObject = new ims.core.vitals.domain.objects.VitalSigns();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_VitalSigns());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.VitalSigns)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.VitalSigns) domainFactory.getDomainObject(ims.core.vitals.domain.objects.VitalSigns.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_VitalSigns());

		domainObject.setBloodPressure(ims.core.vo.domain.VSBloodPressureAssembler.extractBloodpressure(domainFactory, valueObject.getBloodPressure(), domMap));
		domainObject.setPulse(ims.core.vo.domain.VSPulseAssembler.extractPulse(domainFactory, valueObject.getPulse(), domMap));
		domainObject.setRespiratory(ims.core.vo.domain.VSRespirationsAssembler.extractRespiratory(domainFactory, valueObject.getRespiratory(), domMap));
		domainObject.setTemperature(ims.core.vo.domain.VSTemperatureAssembler.extractTemperature(domainFactory, valueObject.getTemperature(), domMap));
		domainObject.setGlasgowComaScale(ims.core.vo.domain.VSGlasgowComaScaleAssembler.extractGCS(domainFactory, valueObject.getGlasgowComaScale(), domMap));
		domainObject.setOxygenSaturation(ims.core.vo.domain.VSOxygenSaturationAssembler.extractOxygenSaturation(domainFactory, valueObject.getOxygenSaturation(), domMap));
		domainObject.setBloodSugar(ims.core.vo.domain.VSBloodSugarAssembler.extractBloodSugar(domainFactory, valueObject.getBloodSugar(), domMap));
		domainObject.setPupils(ims.core.vo.domain.VSPupilsAssembler.extractPupils(domainFactory, valueObject.getPupils(), domMap));
		domainObject.setVisualAcuity(ims.core.vo.domain.VSVisualAcuityAssembler.extractVisualAcuity(domainFactory, valueObject.getVisualAcuity(), domMap));
		domainObject.setMetrics(ims.core.vo.domain.VSMetricsAssembler.extractMetrics(domainFactory, valueObject.getMetrics(), domMap));
		domainObject.setArterialBloodGas(ims.core.vo.domain.VSArterialBloodGasAssembler.extractArterialBloodGas(domainFactory, valueObject.getArterialBloodGas(), domMap));
		domainObject.setVentilationChart(ims.core.vo.domain.VSVentilationChartVoAssembler.extractVentilationChart(domainFactory, valueObject.getVentilationChart(), domMap));
		ims.core.vo.lookups.VSTypeCollection collection13 =
	valueObject.getRecordedSigns();
	    java.util.List domainRecordedSigns = domainObject.getRecordedSigns();;			
	    int collection13Size=0;
		if (collection13 == null)
		{
			domainRecordedSigns = new java.util.ArrayList(0);
		}
		else
		{
			collection13Size = collection13.size();
		}
		
		for(int i=0; i<collection13Size; i++) 
		{
			int instanceId = collection13.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainRecordedSigns.indexOf(dom);
			if (domIdx == -1)
			{
				domainRecordedSigns.add(i, dom);
			}
			else if (i != domIdx && i < domainRecordedSigns.size())
			{
				Object tmp = domainRecordedSigns.get(i);
				domainRecordedSigns.set(i, domainRecordedSigns.get(domIdx));
				domainRecordedSigns.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j13 = domainRecordedSigns.size();
		while (j13 > collection13Size)
		{
			domainRecordedSigns.remove(j13-1);
			j13 = domainRecordedSigns.size();
		}

		domainObject.setRecordedSigns(domainRecordedSigns);		
		domainObject.setLungFunctionTest(ims.core.vo.domain.VSLungFunctionTestVoAssembler.extractLungFunctionTests(domainFactory, valueObject.getLungFunctionTest(), domMap));
		domainObject.setPain(ims.core.vo.domain.VSPainLadderVoAssembler.extractPain(domainFactory, valueObject.getPain(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getPatientConscious() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getPatientConscious().getID());
		}
		domainObject.setPatientConscious(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getUrine2mlkgkhr() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getUrine2mlkgkhr().getID());
		}
		domainObject.setUrine2mlkgkhr(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getPatientCausingConcern() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getPatientCausingConcern().getID());
		}
		domainObject.setPatientCausingConcern(value18);
		domainObject.setRecordingInformation(ims.core.vo.domain.RecordingUserInformationVoAssembler.extractRecordingUserInformation(domainFactory, valueObject.getRecordingInformation(), domMap));
		domainObject.setIsVentilationChartRecord(valueObject.getIsVentilationChartRecord());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value21 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value21 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value21 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value21);
		ims.framework.utils.DateTime dateTime22 = valueObject.getVitalsTakenDateTime();
		java.util.Date value22 = null;
		if ( dateTime22 != null ) 
		{
			value22 = dateTime22.getJavaDate();
		}
		domainObject.setVitalsTakenDateTime(value22);
		ims.core.admin.domain.objects.CareContext value23 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value23 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value23 = domainObject.getCareContext();	
			}
			else
			{
				value23 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value23);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
