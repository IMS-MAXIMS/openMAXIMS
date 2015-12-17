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
 * @author George Cristian Josan
 */
public class PatientElectiveListBedAdmissionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo copy(ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObjectDest, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientElectiveList(valueObjectSrc.getID_PatientElectiveList());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// Bed
		valueObjectDest.setBed(valueObjectSrc.getBed());
		// AnticipatedStay
		valueObjectDest.setAnticipatedStay(valueObjectSrc.getAnticipatedStay());
		// TCIDetails
		valueObjectDest.setTCIDetails(valueObjectSrc.getTCIDetails());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ElectiveListStatus
		valueObjectDest.setElectiveListStatus(valueObjectSrc.getElectiveListStatus());
		// ElectiveListStatusHistory
		valueObjectDest.setElectiveListStatusHistory(valueObjectSrc.getElectiveListStatusHistory());
		// ElectiveListReason
		valueObjectDest.setElectiveListReason(valueObjectSrc.getElectiveListReason());
		// Referral
		valueObjectDest.setReferral(valueObjectSrc.getReferral());
		// EROD
		valueObjectDest.setEROD(valueObjectSrc.getEROD());
		// ERODHistory
		valueObjectDest.setERODHistory(valueObjectSrc.getERODHistory());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// DateOnList
		valueObjectDest.setDateOnList(valueObjectSrc.getDateOnList());
		// PrimaryProcedure
		valueObjectDest.setPrimaryProcedure(valueObjectSrc.getPrimaryProcedure());
		// Admissions
		valueObjectDest.setAdmissions(valueObjectSrc.getAdmissions());
		// ElectiveAdmissionType
		valueObjectDest.setElectiveAdmissionType(valueObjectSrc.getElectiveAdmissionType());
		// was28DayRuleApplied
		valueObjectDest.setWas28DayRuleApplied(valueObjectSrc.getWas28DayRuleApplied());
		// SubjectTo28DayRule
		valueObjectDest.setSubjectTo28DayRule(valueObjectSrc.getSubjectTo28DayRule());
		// Rule28DayStatus
		valueObjectDest.setRule28DayStatus(valueObjectSrc.getRule28DayStatus());
		// Rule28DayPeriodStart
		valueObjectDest.setRule28DayPeriodStart(valueObjectSrc.getRule28DayPeriodStart());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(java.util.Set domainObjectSet)	
	{
		return createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voList = new ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection();
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
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(java.util.List domainObjectList) 
	{
		return createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.PatientElectiveList objects.
	 */
	public static ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection createPatientElectiveListBedAdmissionVoCollectionFromPatientElectiveList(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voList = new ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.PatientElectiveList domainObject = (ims.RefMan.domain.objects.PatientElectiveList) domainObjectList.get(i);
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientElectiveListSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListBedAdmissionVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection) 
	 {
	 	return extractPatientElectiveListList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientElectiveListList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.PatientElectiveList domainObject = PatientElectiveListBedAdmissionVoAssembler.extractPatientElectiveList(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo create(ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	  public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo create(DomainObjectMap map, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject = (ims.RefMan.vo.PatientElectiveListBedAdmissionVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientElectiveListBedAdmissionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientElectiveListBedAdmissionVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo insert(ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
	 public static ims.RefMan.vo.PatientElectiveListBedAdmissionVo insert(DomainObjectMap map, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, ims.RefMan.domain.objects.PatientElectiveList domainObject) 
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
			
		// ElectiveList
		valueObject.setElectiveList(ims.RefMan.vo.domain.ElectiveListConfigurationLiteVoAssembler.create(map, domainObject.getElectiveList()) );
		// Bed
		valueObject.setBed(domainObject.getBed());
		// AnticipatedStay
		valueObject.setAnticipatedStay(domainObject.getAnticipatedStay());
		// TCIDetails
		valueObject.setTCIDetails(ims.ccosched.vo.domain.TCIForPatientElectiveListBedInfoDetailsVoAssembler.create(map, domainObject.getTCIDetails()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLite_IdentifiersVoAssembler.create(map, domainObject.getPatient()) );
		// ElectiveListStatus
		valueObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.create(map, domainObject.getElectiveListStatus()) );
		// ElectiveListStatusHistory
		ims.RefMan.vo.ElectiveListStatusRefVoCollection ElectiveListStatusHistory = new ims.RefMan.vo.ElectiveListStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getElectiveListStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ElectiveListStatus tmp = (ims.RefMan.domain.objects.ElectiveListStatus)iterator.next();
			if (tmp != null)
				ElectiveListStatusHistory.add(new ims.RefMan.vo.ElectiveListStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setElectiveListStatusHistory(ElectiveListStatusHistory);
		// ElectiveListReason
		ims.domain.lookups.LookupInstance instance8 = domainObject.getElectiveListReason();
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

			ims.emergency.vo.lookups.ElectiveListReason voLookup8 = new ims.emergency.vo.lookups.ElectiveListReason(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.emergency.vo.lookups.ElectiveListReason parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.emergency.vo.lookups.ElectiveListReason(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setElectiveListReason(voLookup8);
		}
				// Referral
		valueObject.setReferral(ims.RefMan.vo.domain.CATSReferralWithContextPasVoAssembler.create(map, domainObject.getReferral()) );
		// EROD
		valueObject.setEROD(ims.RefMan.vo.domain.ReferralErodForCancellationVoAssembler.create(map, domainObject.getEROD()) );
		// ERODHistory
		ims.RefMan.vo.ReferralERODRefVoCollection ERODHistory = new ims.RefMan.vo.ReferralERODRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getERODHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.RefMan.domain.objects.ReferralEROD tmp = (ims.RefMan.domain.objects.ReferralEROD)iterator.next();
			if (tmp != null)
				ERODHistory.add(new ims.RefMan.vo.ReferralERODRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setERODHistory(ERODHistory);
		// PathwayClock
		valueObject.setPathwayClock(ims.pathways.vo.domain.PathwayClockVoAssembler.create(map, domainObject.getPathwayClock()) );
		// DateOnList
		java.util.Date DateOnList = domainObject.getDateOnList();
		if ( null != DateOnList ) 
		{
			valueObject.setDateOnList(new ims.framework.utils.Date(DateOnList) );
		}
		// PrimaryProcedure
		valueObject.setPrimaryProcedure(ims.core.vo.domain.ProcedureLiteVoAssembler.create(map, domainObject.getPrimaryProcedure()) );
		// Admissions
		ims.core.admin.pas.vo.AdmissionDetailRefVoCollection Admissions = new ims.core.admin.pas.vo.AdmissionDetailRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAdmissions().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.AdmissionDetail tmp = (ims.core.admin.pas.domain.objects.AdmissionDetail)iterator.next();
			if (tmp != null)
				Admissions.add(new ims.core.admin.pas.vo.AdmissionDetailRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAdmissions(Admissions);
		// ElectiveAdmissionType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getElectiveAdmissionType();
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

			ims.RefMan.vo.lookups.ElectiveAdmissionType voLookup16 = new ims.RefMan.vo.lookups.ElectiveAdmissionType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ElectiveAdmissionType parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.RefMan.vo.lookups.ElectiveAdmissionType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setElectiveAdmissionType(voLookup16);
		}
				// was28DayRuleApplied
		valueObject.setWas28DayRuleApplied( domainObject.isWas28DayRuleApplied() );
		// SubjectTo28DayRule
		valueObject.setSubjectTo28DayRule( domainObject.isSubjectTo28DayRule() );
		// Rule28DayStatus
		ims.domain.lookups.LookupInstance instance19 = domainObject.getRule28DayStatus();
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

			ims.scheduling.vo.lookups.Rule28DayStatus voLookup19 = new ims.scheduling.vo.lookups.Rule28DayStatus(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Rule28DayStatus parentVoLookup19 = voLookup19;
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
								parentVoLookup19.setParent(new ims.scheduling.vo.lookups.Rule28DayStatus(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setRule28DayStatus(voLookup19);
		}
				// Rule28DayPeriodStart
		java.util.Date Rule28DayPeriodStart = domainObject.getRule28DayPeriodStart();
		if ( null != Rule28DayPeriodStart ) 
		{
			valueObject.setRule28DayPeriodStart(new ims.framework.utils.Date(Rule28DayPeriodStart) );
		}
		// PatientCategory
		ims.domain.lookups.LookupInstance instance21 = domainObject.getPatientCategory();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup21 = new ims.core.vo.lookups.PatientStatus(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.core.vo.lookups.PatientStatus(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setPatientCategory(voLookup21);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject) 
	{
		return 	extractPatientElectiveList(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.PatientElectiveList extractPatientElectiveList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientElectiveListBedAdmissionVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientElectiveListBedAdmissionVo ID_PatientElectiveList field is unknown
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
	ims.core.configuration.domain.objects.ElectiveListConfiguration value1 = null;
		if ( null != valueObject.getElectiveList() ) 
		{
			if (valueObject.getElectiveList().getBoId() == null)
			{
				if (domMap.get(valueObject.getElectiveList()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domMap.get(valueObject.getElectiveList());
				}
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.ElectiveListConfiguration)domainFactory.getDomainObject(ims.core.configuration.domain.objects.ElectiveListConfiguration.class, valueObject.getElectiveList().getBoId());
			}
		}
		domainObject.setElectiveList(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBed() != null && valueObject.getBed().equals(""))
		{
			valueObject.setBed(null);
		}
		domainObject.setBed(valueObject.getBed());
		domainObject.setAnticipatedStay(valueObject.getAnticipatedStay());
		domainObject.setTCIDetails(ims.ccosched.vo.domain.TCIForPatientElectiveListBedInfoDetailsVoAssembler.extractTCIForPatientElectiveList(domainFactory, valueObject.getTCIDetails(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value5 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value5 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value5 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value5);
		domainObject.setElectiveListStatus(ims.RefMan.vo.domain.ElectiveListStatusVoAssembler.extractElectiveListStatus(domainFactory, valueObject.getElectiveListStatus(), domMap));

		ims.RefMan.vo.ElectiveListStatusRefVoCollection refCollection7 = valueObject.getElectiveListStatusHistory();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.List domainElectiveListStatusHistory7 = domainObject.getElectiveListStatusHistory();
		if (domainElectiveListStatusHistory7 == null)
		{
			domainElectiveListStatusHistory7 = new java.util.ArrayList();
		}
		for(int i=0; i < size7; i++) 
		{
			ims.RefMan.vo.ElectiveListStatusRefVo vo = refCollection7.get(i);			
			ims.RefMan.domain.objects.ElectiveListStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ElectiveListStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ElectiveListStatus)domainFactory.getDomainObject( ims.RefMan.domain.objects.ElectiveListStatus.class, vo.getBoId());
				}
			}

			int domIdx = domainElectiveListStatusHistory7.indexOf(dom);
			if (domIdx == -1)
			{
				domainElectiveListStatusHistory7.add(i, dom);
			}
			else if (i != domIdx && i < domainElectiveListStatusHistory7.size())
			{
				Object tmp = domainElectiveListStatusHistory7.get(i);
				domainElectiveListStatusHistory7.set(i, domainElectiveListStatusHistory7.get(domIdx));
				domainElectiveListStatusHistory7.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i7 = domainElectiveListStatusHistory7.size();
		while (i7 > size7)
		{
			domainElectiveListStatusHistory7.remove(i7-1);
			i7 = domainElectiveListStatusHistory7.size();
		}
		
		domainObject.setElectiveListStatusHistory(domainElectiveListStatusHistory7);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getElectiveListReason() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getElectiveListReason().getID());
		}
		domainObject.setElectiveListReason(value8);
		domainObject.setReferral(ims.RefMan.vo.domain.CATSReferralWithContextPasVoAssembler.extractCatsReferral(domainFactory, valueObject.getReferral(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.RefMan.domain.objects.ReferralEROD value10 = null;
		if ( null != valueObject.getEROD() ) 
		{
			if (valueObject.getEROD().getBoId() == null)
			{
				if (domMap.get(valueObject.getEROD()) != null)
				{
					value10 = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(valueObject.getEROD());
				}
			}
			else
			{
				value10 = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralEROD.class, valueObject.getEROD().getBoId());
			}
		}
		domainObject.setEROD(value10);

		ims.RefMan.vo.ReferralERODRefVoCollection refCollection11 = valueObject.getERODHistory();
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.List domainERODHistory11 = domainObject.getERODHistory();
		if (domainERODHistory11 == null)
		{
			domainERODHistory11 = new java.util.ArrayList();
		}
		for(int i=0; i < size11; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection11.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainERODHistory11.indexOf(dom);
			if (domIdx == -1)
			{
				domainERODHistory11.add(i, dom);
			}
			else if (i != domIdx && i < domainERODHistory11.size())
			{
				Object tmp = domainERODHistory11.get(i);
				domainERODHistory11.set(i, domainERODHistory11.get(domIdx));
				domainERODHistory11.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i11 = domainERODHistory11.size();
		while (i11 > size11)
		{
			domainERODHistory11.remove(i11-1);
			i11 = domainERODHistory11.size();
		}
		
		domainObject.setERODHistory(domainERODHistory11);		
		domainObject.setPathwayClock(ims.pathways.vo.domain.PathwayClockVoAssembler.extractPathwayClock(domainFactory, valueObject.getPathwayClock(), domMap));
		java.util.Date value13 = null;
		ims.framework.utils.Date date13 = valueObject.getDateOnList();		
		if ( date13 != null ) 
		{
			value13 = date13.getDate();
		}
		domainObject.setDateOnList(value13);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Procedure value14 = null;
		if ( null != valueObject.getPrimaryProcedure() ) 
		{
			if (valueObject.getPrimaryProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryProcedure()) != null)
				{
					value14 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getPrimaryProcedure());
				}
			}
			else
			{
				value14 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getPrimaryProcedure().getBoId());
			}
		}
		domainObject.setPrimaryProcedure(value14);

		ims.core.admin.pas.vo.AdmissionDetailRefVoCollection refCollection15 = valueObject.getAdmissions();
		int size15 = (null == refCollection15) ? 0 : refCollection15.size();		
		java.util.List domainAdmissions15 = domainObject.getAdmissions();
		if (domainAdmissions15 == null)
		{
			domainAdmissions15 = new java.util.ArrayList();
		}
		for(int i=0; i < size15; i++) 
		{
			ims.core.admin.pas.vo.AdmissionDetailRefVo vo = refCollection15.get(i);			
			ims.core.admin.pas.domain.objects.AdmissionDetail dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.AdmissionDetail.class, vo.getBoId());
				}
			}

			int domIdx = domainAdmissions15.indexOf(dom);
			if (domIdx == -1)
			{
				domainAdmissions15.add(i, dom);
			}
			else if (i != domIdx && i < domainAdmissions15.size())
			{
				Object tmp = domainAdmissions15.get(i);
				domainAdmissions15.set(i, domainAdmissions15.get(domIdx));
				domainAdmissions15.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i15 = domainAdmissions15.size();
		while (i15 > size15)
		{
			domainAdmissions15.remove(i15-1);
			i15 = domainAdmissions15.size();
		}
		
		domainObject.setAdmissions(domainAdmissions15);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getElectiveAdmissionType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getElectiveAdmissionType().getID());
		}
		domainObject.setElectiveAdmissionType(value16);
		domainObject.setWas28DayRuleApplied(valueObject.getWas28DayRuleApplied());
		domainObject.setSubjectTo28DayRule(valueObject.getSubjectTo28DayRule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getRule28DayStatus() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getRule28DayStatus().getID());
		}
		domainObject.setRule28DayStatus(value19);
		java.util.Date value20 = null;
		ims.framework.utils.Date date20 = valueObject.getRule28DayPeriodStart();		
		if ( date20 != null ) 
		{
			value20 = date20.getDate();
		}
		domainObject.setRule28DayPeriodStart(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value21);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value22 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value22 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value22 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value22);

		return domainObject;
	}

}
