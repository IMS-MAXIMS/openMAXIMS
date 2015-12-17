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
 * @author Daniel Laffan
 */
public class AnaestheticSignInVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.AnaestheticSignInVo copy(ims.clinical.vo.AnaestheticSignInVo valueObjectDest, ims.clinical.vo.AnaestheticSignInVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AnaestheticSignIn(valueObjectSrc.getID_AnaestheticSignIn());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TheatreAppointment
		valueObjectDest.setTheatreAppointment(valueObjectSrc.getTheatreAppointment());
		// PatientConfirmedIdentity
		valueObjectDest.setPatientConfirmedIdentity(valueObjectSrc.getPatientConfirmedIdentity());
		// IdBraceletChecked
		valueObjectDest.setIdBraceletChecked(valueObjectSrc.getIdBraceletChecked());
		// AllergiesChecked
		valueObjectDest.setAllergiesChecked(valueObjectSrc.getAllergiesChecked());
		// AllergyBraceletPresen
		valueObjectDest.setAllergyBraceletPresen(valueObjectSrc.getAllergyBraceletPresen());
		// IsPatientDiabetic
		valueObjectDest.setIsPatientDiabetic(valueObjectSrc.getIsPatientDiabetic());
		// ProcedureAndSiteConfirmedByPatient
		valueObjectDest.setProcedureAndSiteConfirmedByPatient(valueObjectSrc.getProcedureAndSiteConfirmedByPatient());
		// ProcedureAndSiteConfirmedByPractitioner
		valueObjectDest.setProcedureAndSiteConfirmedByPractitioner(valueObjectSrc.getProcedureAndSiteConfirmedByPractitioner());
		// OperationSiteMarked
		valueObjectDest.setOperationSiteMarked(valueObjectSrc.getOperationSiteMarked());
		// PatientStarved
		valueObjectDest.setPatientStarved(valueObjectSrc.getPatientStarved());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// RegionalBlockRequired
		valueObjectDest.setRegionalBlockRequired(valueObjectSrc.getRegionalBlockRequired());
		// AnticoagulantStatusConfirmed
		valueObjectDest.setAnticoagulantStatusConfirmed(valueObjectSrc.getAnticoagulantStatusConfirmed());
		// ASAClass
		valueObjectDest.setASAClass(valueObjectSrc.getASAClass());
		// AnaesthesiaMachineAndMedicationCheckComplete
		valueObjectDest.setAnaesthesiaMachineAndMedicationCheckComplete(valueObjectSrc.getAnaesthesiaMachineAndMedicationCheckComplete());
		// KnownDifficultAirway
		valueObjectDest.setKnownDifficultAirway(valueObjectSrc.getKnownDifficultAirway());
		// RiskOrGreaterThan500mlBloodLoss
		valueObjectDest.setRiskOrGreaterThan500mlBloodLoss(valueObjectSrc.getRiskOrGreaterThan500mlBloodLoss());
		// GandSElectronicIssues
		valueObjectDest.setGandSElectronicIssues(valueObjectSrc.getGandSElectronicIssues());
		// IntraoperativeFluidsRequired
		valueObjectDest.setIntraoperativeFluidsRequired(valueObjectSrc.getIntraoperativeFluidsRequired());
		// AntibioticsRequired
		valueObjectDest.setAntibioticsRequired(valueObjectSrc.getAntibioticsRequired());
		// AntibioticsGivenDateTime
		valueObjectDest.setAntibioticsGivenDateTime(valueObjectSrc.getAntibioticsGivenDateTime());
		// PatientPreinductionTemperature
		valueObjectDest.setPatientPreinductionTemperature(valueObjectSrc.getPatientPreinductionTemperature());
		// PreopBloodGlucoseResult
		valueObjectDest.setPreopBloodGlucoseResult(valueObjectSrc.getPreopBloodGlucoseResult());
		// SignatureByRegisteredPractitioner
		valueObjectDest.setSignatureByRegisteredPractitioner(valueObjectSrc.getSignatureByRegisteredPractitioner());
		// LAAnaestheticBlockType
		valueObjectDest.setLAAnaestheticBlockType(valueObjectSrc.getLAAnaestheticBlockType());
		// Interscalene
		valueObjectDest.setInterscalene(valueObjectSrc.getInterscalene());
		// Axillary
		valueObjectDest.setAxillary(valueObjectSrc.getAxillary());
		// LeftAndRightSideCheckedAndSorrectSideMarked
		valueObjectDest.setLeftAndRightSideCheckedAndSorrectSideMarked(valueObjectSrc.getLeftAndRightSideCheckedAndSorrectSideMarked());
		// AnaesthetistSign
		valueObjectDest.setAnaesthetistSign(valueObjectSrc.getAnaesthetistSign());
		// DenturesImplantsLooseTeeth
		valueObjectDest.setDenturesImplantsLooseTeeth(valueObjectSrc.getDenturesImplantsLooseTeeth());
		// RelevantChartsNotesPresent
		valueObjectDest.setRelevantChartsNotesPresent(valueObjectSrc.getRelevantChartsNotesPresent());
		// AllergiesConfirmedByPatient
		valueObjectDest.setAllergiesConfirmedByPatient(valueObjectSrc.getAllergiesConfirmedByPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAnaestheticSignInVoCollectionFromAnaestheticSignIn(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.AnaestheticSignIn objects.
	 */
	public static ims.clinical.vo.AnaestheticSignInVoCollection createAnaestheticSignInVoCollectionFromAnaestheticSignIn(java.util.Set domainObjectSet)	
	{
		return createAnaestheticSignInVoCollectionFromAnaestheticSignIn(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.AnaestheticSignIn objects.
	 */
	public static ims.clinical.vo.AnaestheticSignInVoCollection createAnaestheticSignInVoCollectionFromAnaestheticSignIn(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.AnaestheticSignInVoCollection voList = new ims.clinical.vo.AnaestheticSignInVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.AnaestheticSignIn domainObject = (ims.clinical.domain.objects.AnaestheticSignIn) iterator.next();
			ims.clinical.vo.AnaestheticSignInVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.AnaestheticSignIn objects.
	 */
	public static ims.clinical.vo.AnaestheticSignInVoCollection createAnaestheticSignInVoCollectionFromAnaestheticSignIn(java.util.List domainObjectList) 
	{
		return createAnaestheticSignInVoCollectionFromAnaestheticSignIn(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.AnaestheticSignIn objects.
	 */
	public static ims.clinical.vo.AnaestheticSignInVoCollection createAnaestheticSignInVoCollectionFromAnaestheticSignIn(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.AnaestheticSignInVoCollection voList = new ims.clinical.vo.AnaestheticSignInVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.AnaestheticSignIn domainObject = (ims.clinical.domain.objects.AnaestheticSignIn) domainObjectList.get(i);
			ims.clinical.vo.AnaestheticSignInVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.AnaestheticSignIn set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAnaestheticSignInSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVoCollection voCollection) 
	 {
	 	return extractAnaestheticSignInSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAnaestheticSignInSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.AnaestheticSignInVo vo = voCollection.get(i);
			ims.clinical.domain.objects.AnaestheticSignIn domainObject = AnaestheticSignInVoAssembler.extractAnaestheticSignIn(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.AnaestheticSignIn list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAnaestheticSignInList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVoCollection voCollection) 
	 {
	 	return extractAnaestheticSignInList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAnaestheticSignInList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.AnaestheticSignInVo vo = voCollection.get(i);
			ims.clinical.domain.objects.AnaestheticSignIn domainObject = AnaestheticSignInVoAssembler.extractAnaestheticSignIn(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.AnaestheticSignIn object.
	 * @param domainObject ims.clinical.domain.objects.AnaestheticSignIn
	 */
	 public static ims.clinical.vo.AnaestheticSignInVo create(ims.clinical.domain.objects.AnaestheticSignIn domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.AnaestheticSignIn object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.AnaestheticSignInVo create(DomainObjectMap map, ims.clinical.domain.objects.AnaestheticSignIn domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.AnaestheticSignInVo valueObject = (ims.clinical.vo.AnaestheticSignInVo) map.getValueObject(domainObject, ims.clinical.vo.AnaestheticSignInVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.AnaestheticSignInVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.AnaestheticSignIn
	 */
	 public static ims.clinical.vo.AnaestheticSignInVo insert(ims.clinical.vo.AnaestheticSignInVo valueObject, ims.clinical.domain.objects.AnaestheticSignIn domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.AnaestheticSignIn
	 */
	 public static ims.clinical.vo.AnaestheticSignInVo insert(DomainObjectMap map, ims.clinical.vo.AnaestheticSignInVo valueObject, ims.clinical.domain.objects.AnaestheticSignIn domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AnaestheticSignIn(domainObject.getId());
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
			
		// TheatreAppointment
		if (domainObject.getTheatreAppointment() != null)
		{
			if(domainObject.getTheatreAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getTheatreAppointment().getId(), domainObject.getTheatreAppointment().getVersion()));
			}
		}
		// PatientConfirmedIdentity
		valueObject.setPatientConfirmedIdentity( domainObject.isPatientConfirmedIdentity() );
		// IdBraceletChecked
		valueObject.setIdBraceletChecked( domainObject.isIdBraceletChecked() );
		// AllergiesChecked
		valueObject.setAllergiesChecked( domainObject.isAllergiesChecked() );
		// AllergyBraceletPresen
		valueObject.setAllergyBraceletPresen( domainObject.isAllergyBraceletPresen() );
		// IsPatientDiabetic
		ims.domain.lookups.LookupInstance instance6 = domainObject.getIsPatientDiabetic();
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

			ims.core.vo.lookups.YesNo voLookup6 = new ims.core.vo.lookups.YesNo(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNo(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setIsPatientDiabetic(voLookup6);
		}
				// ProcedureAndSiteConfirmedByPatient
		ims.domain.lookups.LookupInstance instance7 = domainObject.getProcedureAndSiteConfirmedByPatient();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesUnable voLookup7 = new ims.core.vo.lookups.YesUnable(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesUnable parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesUnable(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setProcedureAndSiteConfirmedByPatient(voLookup7);
		}
				// ProcedureAndSiteConfirmedByPractitioner
		ims.domain.lookups.LookupInstance instance8 = domainObject.getProcedureAndSiteConfirmedByPractitioner();
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

			ims.core.vo.lookups.YesNotApplicable voLookup8 = new ims.core.vo.lookups.YesNotApplicable(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNotApplicable parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNotApplicable(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setProcedureAndSiteConfirmedByPractitioner(voLookup8);
		}
				// OperationSiteMarked
		ims.domain.lookups.LookupInstance instance9 = domainObject.getOperationSiteMarked();
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

			ims.core.vo.lookups.YesNotApplicable voLookup9 = new ims.core.vo.lookups.YesNotApplicable(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNotApplicable parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNotApplicable(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setOperationSiteMarked(voLookup9);
		}
				// PatientStarved
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPatientStarved();
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

			ims.core.vo.lookups.YesNoNotApplicable voLookup10 = new ims.core.vo.lookups.YesNoNotApplicable(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoNotApplicable parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNoNotApplicable(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPatientStarved(voLookup10);
		}
				// AnaestheticType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getAnaestheticType();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup11 = new ims.clinical.vo.lookups.AnaestheticType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setAnaestheticType(voLookup11);
		}
				// RegionalBlockRequired
		valueObject.setRegionalBlockRequired( domainObject.isRegionalBlockRequired() );
		// AnticoagulantStatusConfirmed
		valueObject.setAnticoagulantStatusConfirmed( domainObject.isAnticoagulantStatusConfirmed() );
		// ASAClass
		valueObject.setASAClass(domainObject.getASAClass());
		// AnaesthesiaMachineAndMedicationCheckComplete
		valueObject.setAnaesthesiaMachineAndMedicationCheckComplete( domainObject.isAnaesthesiaMachineAndMedicationCheckComplete() );
		// KnownDifficultAirway
		ims.domain.lookups.LookupInstance instance16 = domainObject.getKnownDifficultAirway();
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

			ims.core.vo.lookups.YesNo voLookup16 = new ims.core.vo.lookups.YesNo(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.core.vo.lookups.YesNo(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setKnownDifficultAirway(voLookup16);
		}
				// RiskOrGreaterThan500mlBloodLoss
		ims.domain.lookups.LookupInstance instance17 = domainObject.getRiskOrGreaterThan500mlBloodLoss();
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

			ims.core.vo.lookups.YesNo voLookup17 = new ims.core.vo.lookups.YesNo(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.YesNo(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setRiskOrGreaterThan500mlBloodLoss(voLookup17);
		}
				// GandSElectronicIssues
		valueObject.setGandSElectronicIssues( domainObject.isGandSElectronicIssues() );
		// IntraoperativeFluidsRequired
		ims.domain.lookups.LookupInstance instance19 = domainObject.getIntraoperativeFluidsRequired();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup19 = new ims.core.vo.lookups.YesNo(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.core.vo.lookups.YesNo(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setIntraoperativeFluidsRequired(voLookup19);
		}
				// AntibioticsRequired
		valueObject.setAntibioticsRequired( domainObject.isAntibioticsRequired() );
		// AntibioticsGivenDateTime
		java.util.Date AntibioticsGivenDateTime = domainObject.getAntibioticsGivenDateTime();
		if ( null != AntibioticsGivenDateTime ) 
		{
			valueObject.setAntibioticsGivenDateTime(new ims.framework.utils.DateTime(AntibioticsGivenDateTime) );
		}
		// PatientPreinductionTemperature
		valueObject.setPatientPreinductionTemperature(domainObject.getPatientPreinductionTemperature());
		// PreopBloodGlucoseResult
		valueObject.setPreopBloodGlucoseResult(domainObject.getPreopBloodGlucoseResult());
		// SignatureByRegisteredPractitioner
		valueObject.setSignatureByRegisteredPractitioner((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getSignatureByRegisteredPractitioner()) );
		// LAAnaestheticBlockType
		java.util.List listLAAnaestheticBlockType = domainObject.getLAAnaestheticBlockType();
		ims.clinical.vo.lookups.LAAnaestheticBlockTypeCollection LAAnaestheticBlockType = new ims.clinical.vo.lookups.LAAnaestheticBlockTypeCollection();
		for(java.util.Iterator iterator = listLAAnaestheticBlockType.iterator(); iterator.hasNext(); ) 
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
			ims.clinical.vo.lookups.LAAnaestheticBlockType voInstance = new ims.clinical.vo.lookups.LAAnaestheticBlockType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.LAAnaestheticBlockType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.clinical.vo.lookups.LAAnaestheticBlockType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			LAAnaestheticBlockType.add(voInstance);
		}
		valueObject.setLAAnaestheticBlockType( LAAnaestheticBlockType );
		// Interscalene
		valueObject.setInterscalene( domainObject.isInterscalene() );
		// Axillary
		valueObject.setAxillary( domainObject.isAxillary() );
		// LeftAndRightSideCheckedAndSorrectSideMarked
		ims.domain.lookups.LookupInstance instance28 = domainObject.getLeftAndRightSideCheckedAndSorrectSideMarked();
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

			ims.clinical.vo.lookups.LeftAndRightSideCheckedAndCorrectSideMarked voLookup28 = new ims.clinical.vo.lookups.LeftAndRightSideCheckedAndCorrectSideMarked(instance28.getId(),instance28.getText(), instance28.isActive(), null, img, color);
			ims.clinical.vo.lookups.LeftAndRightSideCheckedAndCorrectSideMarked parentVoLookup28 = voLookup28;
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
								parentVoLookup28.setParent(new ims.clinical.vo.lookups.LeftAndRightSideCheckedAndCorrectSideMarked(parent28.getId(),parent28.getText(), parent28.isActive(), null, img, color));
				parentVoLookup28 = parentVoLookup28.getParent();
								parent28 = parent28.getParent();
			}			
			valueObject.setLeftAndRightSideCheckedAndSorrectSideMarked(voLookup28);
		}
				// AnaesthetistSign
		valueObject.setAnaesthetistSign((ims.core.vo.MedicVo)ims.core.vo.domain.MedicVoAssembler.create(map, domainObject.getAnaesthetistSign()) );
		// DenturesImplantsLooseTeeth
		valueObject.setDenturesImplantsLooseTeeth( domainObject.isDenturesImplantsLooseTeeth() );
		// RelevantChartsNotesPresent
		valueObject.setRelevantChartsNotesPresent( domainObject.isRelevantChartsNotesPresent() );
		// AllergiesConfirmedByPatient
		ims.domain.lookups.LookupInstance instance32 = domainObject.getAllergiesConfirmedByPatient();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesUnable voLookup32 = new ims.core.vo.lookups.YesUnable(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.core.vo.lookups.YesUnable parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.core.vo.lookups.YesUnable(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setAllergiesConfirmedByPatient(voLookup32);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.AnaestheticSignIn extractAnaestheticSignIn(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVo valueObject) 
	{
		return 	extractAnaestheticSignIn(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.AnaestheticSignIn extractAnaestheticSignIn(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.AnaestheticSignInVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AnaestheticSignIn();
		ims.clinical.domain.objects.AnaestheticSignIn domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.AnaestheticSignIn)domMap.get(valueObject);
			}
			// ims.clinical.vo.AnaestheticSignInVo ID_AnaestheticSignIn field is unknown
			domainObject = new ims.clinical.domain.objects.AnaestheticSignIn();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AnaestheticSignIn());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.AnaestheticSignIn)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.AnaestheticSignIn) domainFactory.getDomainObject(ims.clinical.domain.objects.AnaestheticSignIn.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AnaestheticSignIn());

		ims.scheduling.domain.objects.Booking_Appointment value1 = null;
		if ( null != valueObject.getTheatreAppointment() ) 
		{
			if (valueObject.getTheatreAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreAppointment()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getTheatreAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getTheatreAppointment();	
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getTheatreAppointment().getBoId());
			}
		}
		domainObject.setTheatreAppointment(value1);
		domainObject.setPatientConfirmedIdentity(valueObject.getPatientConfirmedIdentity());
		domainObject.setIdBraceletChecked(valueObject.getIdBraceletChecked());
		domainObject.setAllergiesChecked(valueObject.getAllergiesChecked());
		domainObject.setAllergyBraceletPresen(valueObject.getAllergyBraceletPresen());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getIsPatientDiabetic() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getIsPatientDiabetic().getID());
		}
		domainObject.setIsPatientDiabetic(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getProcedureAndSiteConfirmedByPatient() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getProcedureAndSiteConfirmedByPatient().getID());
		}
		domainObject.setProcedureAndSiteConfirmedByPatient(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getProcedureAndSiteConfirmedByPractitioner() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getProcedureAndSiteConfirmedByPractitioner().getID());
		}
		domainObject.setProcedureAndSiteConfirmedByPractitioner(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getOperationSiteMarked() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getOperationSiteMarked().getID());
		}
		domainObject.setOperationSiteMarked(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPatientStarved() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPatientStarved().getID());
		}
		domainObject.setPatientStarved(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getAnaestheticType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticType().getID());
		}
		domainObject.setAnaestheticType(value11);
		domainObject.setRegionalBlockRequired(valueObject.getRegionalBlockRequired());
		domainObject.setAnticoagulantStatusConfirmed(valueObject.getAnticoagulantStatusConfirmed());
		domainObject.setASAClass(valueObject.getASAClass());
		domainObject.setAnaesthesiaMachineAndMedicationCheckComplete(valueObject.getAnaesthesiaMachineAndMedicationCheckComplete());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getKnownDifficultAirway() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getKnownDifficultAirway().getID());
		}
		domainObject.setKnownDifficultAirway(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getRiskOrGreaterThan500mlBloodLoss() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getRiskOrGreaterThan500mlBloodLoss().getID());
		}
		domainObject.setRiskOrGreaterThan500mlBloodLoss(value17);
		domainObject.setGandSElectronicIssues(valueObject.getGandSElectronicIssues());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getIntraoperativeFluidsRequired() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getIntraoperativeFluidsRequired().getID());
		}
		domainObject.setIntraoperativeFluidsRequired(value19);
		domainObject.setAntibioticsRequired(valueObject.getAntibioticsRequired());
		ims.framework.utils.DateTime dateTime21 = valueObject.getAntibioticsGivenDateTime();
		java.util.Date value21 = null;
		if ( dateTime21 != null ) 
		{
			value21 = dateTime21.getJavaDate();
		}
		domainObject.setAntibioticsGivenDateTime(value21);
		domainObject.setPatientPreinductionTemperature(valueObject.getPatientPreinductionTemperature());
		domainObject.setPreopBloodGlucoseResult(valueObject.getPreopBloodGlucoseResult());
		domainObject.setSignatureByRegisteredPractitioner(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getSignatureByRegisteredPractitioner(), domMap));
		ims.clinical.vo.lookups.LAAnaestheticBlockTypeCollection collection25 =
	valueObject.getLAAnaestheticBlockType();
	    java.util.List domainLAAnaestheticBlockType = domainObject.getLAAnaestheticBlockType();;			
	    int collection25Size=0;
		if (collection25 == null)
		{
			domainLAAnaestheticBlockType = new java.util.ArrayList(0);
		}
		else
		{
			collection25Size = collection25.size();
		}
		
		for(int i=0; i<collection25Size; i++) 
		{
			int instanceId = collection25.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainLAAnaestheticBlockType.indexOf(dom);
			if (domIdx == -1)
			{
				domainLAAnaestheticBlockType.add(i, dom);
			}
			else if (i != domIdx && i < domainLAAnaestheticBlockType.size())
			{
				Object tmp = domainLAAnaestheticBlockType.get(i);
				domainLAAnaestheticBlockType.set(i, domainLAAnaestheticBlockType.get(domIdx));
				domainLAAnaestheticBlockType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j25 = domainLAAnaestheticBlockType.size();
		while (j25 > collection25Size)
		{
			domainLAAnaestheticBlockType.remove(j25-1);
			j25 = domainLAAnaestheticBlockType.size();
		}

		domainObject.setLAAnaestheticBlockType(domainLAAnaestheticBlockType);		
		domainObject.setInterscalene(valueObject.getInterscalene());
		domainObject.setAxillary(valueObject.getAxillary());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value28 = null;
		if ( null != valueObject.getLeftAndRightSideCheckedAndSorrectSideMarked() ) 
		{
			value28 =
				domainFactory.getLookupInstance(valueObject.getLeftAndRightSideCheckedAndSorrectSideMarked().getID());
		}
		domainObject.setLeftAndRightSideCheckedAndSorrectSideMarked(value28);
		domainObject.setAnaesthetistSign(ims.core.vo.domain.MedicVoAssembler.extractMedic(domainFactory, (ims.core.vo.MedicVo)valueObject.getAnaesthetistSign(), domMap));
		domainObject.setDenturesImplantsLooseTeeth(valueObject.getDenturesImplantsLooseTeeth());
		domainObject.setRelevantChartsNotesPresent(valueObject.getRelevantChartsNotesPresent());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getAllergiesConfirmedByPatient() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getAllergiesConfirmedByPatient().getID());
		}
		domainObject.setAllergiesConfirmedByPatient(value32);

		return domainObject;
	}

}
