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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class DischargedEpisodeADTVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.DischargedEpisodeADTVo copy(ims.core.vo.DischargedEpisodeADTVo valueObjectDest, ims.core.vo.DischargedEpisodeADTVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DischargedEpisode(valueObjectSrc.getID_DischargedEpisode());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// pasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// wardStays
		valueObjectDest.setWardStays(valueObjectSrc.getWardStays());
		// consultantStays
		valueObjectDest.setConsultantStays(valueObjectSrc.getConsultantStays());
		// dischargeDateTime
		valueObjectDest.setDischargeDateTime(valueObjectSrc.getDischargeDateTime());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// MethodOfDischarge
		valueObjectDest.setMethodOfDischarge(valueObjectSrc.getMethodOfDischarge());
		// WasTreatmentDeferred
		valueObjectDest.setWasTreatmentDeferred(valueObjectSrc.getWasTreatmentDeferred());
		// EighteenWeekClockStopped
		valueObjectDest.setEighteenWeekClockStopped(valueObjectSrc.getEighteenWeekClockStopped());
		// DischargeReadyDate
		valueObjectDest.setDischargeReadyDate(valueObjectSrc.getDischargeReadyDate());
		// AdmissionDetail
		valueObjectDest.setAdmissionDetail(valueObjectSrc.getAdmissionDetail());
		// VTEAssessmentStatus
		valueObjectDest.setVTEAssessmentStatus(valueObjectSrc.getVTEAssessmentStatus());
		// VTERiskAssessment
		valueObjectDest.setVTERiskAssessment(valueObjectSrc.getVTERiskAssessment());
		// WasDiagnosticDeferred
		valueObjectDest.setWasDiagnosticDeferred(valueObjectSrc.getWasDiagnosticDeferred());
		// WasTreatmentGiven
		valueObjectDest.setWasTreatmentGiven(valueObjectSrc.getWasTreatmentGiven());
		// DeferredReason
		valueObjectDest.setDeferredReason(valueObjectSrc.getDeferredReason());
		// DischargingWard
		valueObjectDest.setDischargingWard(valueObjectSrc.getDischargingWard());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDischargedEpisodeADTVoCollectionFromDischargedEpisode(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeADTVoCollection createDischargedEpisodeADTVoCollectionFromDischargedEpisode(java.util.Set domainObjectSet)	
	{
		return createDischargedEpisodeADTVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeADTVoCollection createDischargedEpisodeADTVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.DischargedEpisodeADTVoCollection voList = new ims.core.vo.DischargedEpisodeADTVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) iterator.next();
			ims.core.vo.DischargedEpisodeADTVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeADTVoCollection createDischargedEpisodeADTVoCollectionFromDischargedEpisode(java.util.List domainObjectList) 
	{
		return createDischargedEpisodeADTVoCollectionFromDischargedEpisode(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.DischargedEpisode objects.
	 */
	public static ims.core.vo.DischargedEpisodeADTVoCollection createDischargedEpisodeADTVoCollectionFromDischargedEpisode(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.DischargedEpisodeADTVoCollection voList = new ims.core.vo.DischargedEpisodeADTVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainObjectList.get(i);
			ims.core.vo.DischargedEpisodeADTVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDischargedEpisodeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DischargedEpisodeADTVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeADTVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.DischargedEpisode list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVoCollection voCollection) 
	 {
	 	return extractDischargedEpisodeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDischargedEpisodeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DischargedEpisodeADTVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = DischargedEpisodeADTVoAssembler.extractDischargedEpisode(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeADTVo create(ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.DischargedEpisode object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.DischargedEpisodeADTVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.DischargedEpisodeADTVo valueObject = (ims.core.vo.DischargedEpisodeADTVo) map.getValueObject(domainObject, ims.core.vo.DischargedEpisodeADTVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.DischargedEpisodeADTVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeADTVo insert(ims.core.vo.DischargedEpisodeADTVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.DischargedEpisode
	 */
	 public static ims.core.vo.DischargedEpisodeADTVo insert(DomainObjectMap map, ims.core.vo.DischargedEpisodeADTVo valueObject, ims.core.admin.pas.domain.objects.DischargedEpisode domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DischargedEpisode(domainObject.getId());
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
			
		// pasEvent
		valueObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.create(map, domainObject.getPasEvent()) );
		// wardStays
		ims.core.admin.pas.vo.WardStayRefVoCollection wardStays = new ims.core.admin.pas.vo.WardStayRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getWardStays().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.WardStay tmp = (ims.core.admin.pas.domain.objects.WardStay)iterator.next();
			if (tmp != null)
				wardStays.add(new ims.core.admin.pas.vo.WardStayRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setWardStays(wardStays);
		// consultantStays
		ims.core.admin.pas.vo.ConsultantStayRefVoCollection consultantStays = new ims.core.admin.pas.vo.ConsultantStayRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getConsultantStays().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.pas.domain.objects.ConsultantStay tmp = (ims.core.admin.pas.domain.objects.ConsultantStay)iterator.next();
			if (tmp != null)
				consultantStays.add(new ims.core.admin.pas.vo.ConsultantStayRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setConsultantStays(consultantStays);
		// dischargeDateTime
		java.util.Date dischargeDateTime = domainObject.getDischargeDateTime();
		if ( null != dischargeDateTime ) 
		{
			valueObject.setDischargeDateTime(new ims.framework.utils.DateTime(dischargeDateTime) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// DischargeDestination
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDischargeDestination();
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

			ims.coe.vo.lookups.DischargeDestination voLookup6 = new ims.coe.vo.lookups.DischargeDestination(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.coe.vo.lookups.DischargeDestination parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.coe.vo.lookups.DischargeDestination(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDischargeDestination(voLookup6);
		}
				// MethodOfDischarge
		ims.domain.lookups.LookupInstance instance7 = domainObject.getMethodOfDischarge();
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

			ims.core.vo.lookups.MethodOfDischarge voLookup7 = new ims.core.vo.lookups.MethodOfDischarge(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.MethodOfDischarge parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.MethodOfDischarge(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setMethodOfDischarge(voLookup7);
		}
				// WasTreatmentDeferred
		valueObject.setWasTreatmentDeferred( domainObject.isWasTreatmentDeferred() );
		// EighteenWeekClockStopped
		valueObject.setEighteenWeekClockStopped( domainObject.isEighteenWeekClockStopped() );
		// DischargeReadyDate
		java.util.Date DischargeReadyDate = domainObject.getDischargeReadyDate();
		if ( null != DischargeReadyDate ) 
		{
			valueObject.setDischargeReadyDate(new ims.framework.utils.Date(DischargeReadyDate) );
		}
		// AdmissionDetail
		if (domainObject.getAdmissionDetail() != null)
		{
			if(domainObject.getAdmissionDetail() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAdmissionDetail();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(id, -1));				
			}
			else
			{
				valueObject.setAdmissionDetail(new ims.core.admin.pas.vo.AdmissionDetailRefVo(domainObject.getAdmissionDetail().getId(), domainObject.getAdmissionDetail().getVersion()));
			}
		}
		// VTEAssessmentStatus
		ims.domain.lookups.LookupInstance instance12 = domainObject.getVTEAssessmentStatus();
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

			ims.clinical.vo.lookups.VTEAsessmentStatus voLookup12 = new ims.clinical.vo.lookups.VTEAsessmentStatus(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.clinical.vo.lookups.VTEAsessmentStatus parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.clinical.vo.lookups.VTEAsessmentStatus(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setVTEAssessmentStatus(voLookup12);
		}
				// VTERiskAssessment
		if (domainObject.getVTERiskAssessment() != null)
		{
			if(domainObject.getVTERiskAssessment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getVTERiskAssessment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setVTERiskAssessment(new ims.core.clinical.vo.VTERiskAssessmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setVTERiskAssessment(new ims.core.clinical.vo.VTERiskAssessmentRefVo(domainObject.getVTERiskAssessment().getId(), domainObject.getVTERiskAssessment().getVersion()));
			}
		}
		// WasDiagnosticDeferred
		valueObject.setWasDiagnosticDeferred( domainObject.isWasDiagnosticDeferred() );
		// WasTreatmentGiven
		valueObject.setWasTreatmentGiven( domainObject.isWasTreatmentGiven() );
		// DeferredReason
		ims.domain.lookups.LookupInstance instance16 = domainObject.getDereferredReason();
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

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup16 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup16 = voLookup16;
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
								parentVoLookup16.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setDeferredReason(voLookup16);
		}
				// DischargingWard
		if (domainObject.getDischargingWard() != null)
		{
			if(domainObject.getDischargingWard() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getDischargingWard();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setDischargingWard(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setDischargingWard(new ims.core.resource.place.vo.LocationRefVo(domainObject.getDischargingWard().getId(), domainObject.getDischargingWard().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVo valueObject) 
	{
		return 	extractDischargedEpisode(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.DischargedEpisode extractDischargedEpisode(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DischargedEpisodeADTVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DischargedEpisode();
		ims.core.admin.pas.domain.objects.DischargedEpisode domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(valueObject);
			}
			// ims.core.vo.DischargedEpisodeADTVo ID_DischargedEpisode field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.DischargedEpisode();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DischargedEpisode());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.DischargedEpisode)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.DischargedEpisode) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.DischargedEpisode.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DischargedEpisode());

		domainObject.setPasEvent(ims.core.vo.domain.PasEventADTVoAssembler.extractPASEvent(domainFactory, valueObject.getPasEvent(), domMap));

		ims.core.admin.pas.vo.WardStayRefVoCollection refCollection2 = valueObject.getWardStays();
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainWardStays2 = domainObject.getWardStays();
		if (domainWardStays2 == null)
		{
			domainWardStays2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.admin.pas.vo.WardStayRefVo vo = refCollection2.get(i);					
			ims.core.admin.pas.domain.objects.WardStay dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.WardStay)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.WardStay)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.WardStay.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainWardStays2.contains(dom))
			{
				domainWardStays2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainWardStays2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainWardStays2.remove(iter2.next());
		}		
		
		domainObject.setWardStays(domainWardStays2);		

		ims.core.admin.pas.vo.ConsultantStayRefVoCollection refCollection3 = valueObject.getConsultantStays();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainConsultantStays3 = domainObject.getConsultantStays();
		if (domainConsultantStays3 == null)
		{
			domainConsultantStays3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.admin.pas.vo.ConsultantStayRefVo vo = refCollection3.get(i);					
			ims.core.admin.pas.domain.objects.ConsultantStay dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.pas.domain.objects.ConsultantStay)domainFactory.getDomainObject( ims.core.admin.pas.domain.objects.ConsultantStay.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainConsultantStays3.contains(dom))
			{
				domainConsultantStays3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainConsultantStays3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainConsultantStays3.remove(iter3.next());
		}		
		
		domainObject.setConsultantStays(domainConsultantStays3);		
		ims.framework.utils.DateTime dateTime4 = valueObject.getDischargeDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setDischargeDateTime(value4);
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getMethodOfDischarge() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getMethodOfDischarge().getID());
		}
		domainObject.setMethodOfDischarge(value7);
		domainObject.setWasTreatmentDeferred(valueObject.getWasTreatmentDeferred());
		domainObject.setEighteenWeekClockStopped(valueObject.getEighteenWeekClockStopped());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getDischargeReadyDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setDischargeReadyDate(value10);
		ims.core.admin.pas.domain.objects.AdmissionDetail value11 = null;
		if ( null != valueObject.getAdmissionDetail() ) 
		{
			if (valueObject.getAdmissionDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getAdmissionDetail()) != null)
				{
					value11 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domMap.get(valueObject.getAdmissionDetail());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getAdmissionDetail();	
			}
			else
			{
				value11 = (ims.core.admin.pas.domain.objects.AdmissionDetail)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.AdmissionDetail.class, valueObject.getAdmissionDetail().getBoId());
			}
		}
		domainObject.setAdmissionDetail(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getVTEAssessmentStatus() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getVTEAssessmentStatus().getID());
		}
		domainObject.setVTEAssessmentStatus(value12);
		ims.core.clinical.domain.objects.VTERiskAssessment value13 = null;
		if ( null != valueObject.getVTERiskAssessment() ) 
		{
			if (valueObject.getVTERiskAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getVTERiskAssessment()) != null)
				{
					value13 = (ims.core.clinical.domain.objects.VTERiskAssessment)domMap.get(valueObject.getVTERiskAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getVTERiskAssessment();	
			}
			else
			{
				value13 = (ims.core.clinical.domain.objects.VTERiskAssessment)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VTERiskAssessment.class, valueObject.getVTERiskAssessment().getBoId());
			}
		}
		domainObject.setVTERiskAssessment(value13);
		domainObject.setWasDiagnosticDeferred(valueObject.getWasDiagnosticDeferred());
		domainObject.setWasTreatmentGiven(valueObject.getWasTreatmentGiven());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getDeferredReason() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getDeferredReason().getID());
		}
		domainObject.setDereferredReason(value16);
		ims.core.resource.place.domain.objects.Location value17 = null;
		if ( null != valueObject.getDischargingWard() ) 
		{
			if (valueObject.getDischargingWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getDischargingWard()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getDischargingWard());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value17 = domainObject.getDischargingWard();	
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getDischargingWard().getBoId());
			}
		}
		domainObject.setDischargingWard(value17);

		return domainObject;
	}

}
