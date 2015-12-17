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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class SurgicalAuditProcedureDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditProcedureDetailsVo copy(ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObjectDest, ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditProcedureDetails(valueObjectSrc.getID_SurgicalAuditProcedureDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// AnaesthetistNotRequired
		valueObjectDest.setAnaesthetistNotRequired(valueObjectSrc.getAnaesthetistNotRequired());
		// Anaesthetists
		valueObjectDest.setAnaesthetists(valueObjectSrc.getAnaesthetists());
		// AnaesthetistAssistNotRequired
		valueObjectDest.setAnaesthetistAssistNotRequired(valueObjectSrc.getAnaesthetistAssistNotRequired());
		// AnaesthetistAssistedBy
		valueObjectDest.setAnaesthetistAssistedBy(valueObjectSrc.getAnaesthetistAssistedBy());
		// OpPerformedBy
		valueObjectDest.setOpPerformedBy(valueObjectSrc.getOpPerformedBy());
		// ConsultantAssistedBy
		valueObjectDest.setConsultantAssistedBy(valueObjectSrc.getConsultantAssistedBy());
		// AnaestheticNurse
		valueObjectDest.setAnaestheticNurse(valueObjectSrc.getAnaestheticNurse());
		// ScrubNurse
		valueObjectDest.setScrubNurse(valueObjectSrc.getScrubNurse());
		// CirculatingNurse
		valueObjectDest.setCirculatingNurse(valueObjectSrc.getCirculatingNurse());
		// Other
		valueObjectDest.setOther(valueObjectSrc.getOther());
		// SurgicalCheckListPerformed
		valueObjectDest.setSurgicalCheckListPerformed(valueObjectSrc.getSurgicalCheckListPerformed());
		// CheckListNotPerformedReason
		valueObjectDest.setCheckListNotPerformedReason(valueObjectSrc.getCheckListNotPerformedReason());
		// LocumAnaestNurse
		valueObjectDest.setLocumAnaestNurse(valueObjectSrc.getLocumAnaestNurse());
		// LocumScrubNurse
		valueObjectDest.setLocumScrubNurse(valueObjectSrc.getLocumScrubNurse());
		// LocumCirculatingNurse
		valueObjectDest.setLocumCirculatingNurse(valueObjectSrc.getLocumCirculatingNurse());
		// Radiographers
		valueObjectDest.setRadiographers(valueObjectSrc.getRadiographers());
		// AnaestheticUsed
		valueObjectDest.setAnaestheticUsed(valueObjectSrc.getAnaestheticUsed());
		// AnaestheticUsedComment
		valueObjectDest.setAnaestheticUsedComment(valueObjectSrc.getAnaestheticUsedComment());
		// EnterOpTheatreTime
		valueObjectDest.setEnterOpTheatreTime(valueObjectSrc.getEnterOpTheatreTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditProcedureDetails objects.
	 */
	public static ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditProcedureDetails objects.
	 */
	public static ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voList = new ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject = (ims.clinical.domain.objects.SurgicalAuditProcedureDetails) iterator.next();
			ims.clinical.vo.SurgicalAuditProcedureDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditProcedureDetails objects.
	 */
	public static ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(java.util.List domainObjectList) 
	{
		return createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditProcedureDetails objects.
	 */
	public static ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection createSurgicalAuditProcedureDetailsVoCollectionFromSurgicalAuditProcedureDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voList = new ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject = (ims.clinical.domain.objects.SurgicalAuditProcedureDetails) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditProcedureDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditProcedureDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditProcedureDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditProcedureDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditProcedureDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditProcedureDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject = SurgicalAuditProcedureDetailsVoAssembler.extractSurgicalAuditProcedureDetails(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditProcedureDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditProcedureDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditProcedureDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditProcedureDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditProcedureDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject = SurgicalAuditProcedureDetailsVoAssembler.extractSurgicalAuditProcedureDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditProcedureDetails object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditProcedureDetails
	 */
	 public static ims.clinical.vo.SurgicalAuditProcedureDetailsVo create(ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditProcedureDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditProcedureDetailsVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObject = (ims.clinical.vo.SurgicalAuditProcedureDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditProcedureDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditProcedureDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditProcedureDetails
	 */
	 public static ims.clinical.vo.SurgicalAuditProcedureDetailsVo insert(ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObject, ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditProcedureDetails
	 */
	 public static ims.clinical.vo.SurgicalAuditProcedureDetailsVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObject, ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditProcedureDetails(domainObject.getId());
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
		// AnaesthetistNotRequired
		valueObject.setAnaesthetistNotRequired( domainObject.isAnaesthetistNotRequired() );
		// Anaesthetists
		valueObject.setAnaesthetists(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getAnaesthetists()) );
		// AnaesthetistAssistNotRequired
		valueObject.setAnaesthetistAssistNotRequired( domainObject.isAnaesthetistAssistNotRequired() );
		// AnaesthetistAssistedBy
		valueObject.setAnaesthetistAssistedBy(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getAnaesthetistAssistedBy()) );
		// OpPerformedBy
		valueObject.setOpPerformedBy(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getOpPerformedBy()) );
		// ConsultantAssistedBy
		valueObject.setConsultantAssistedBy(ims.core.vo.domain.MedicLiteVoAssembler.createMedicLiteVoCollectionFromMedic(map, domainObject.getConsultantAssistedBy()) );
		// AnaestheticNurse
		valueObject.setAnaestheticNurse(ims.core.vo.domain.NurseVoAssembler.createNurseVoCollectionFromNurse(map, domainObject.getAnaestheticNurse()) );
		// ScrubNurse
		valueObject.setScrubNurse(ims.core.vo.domain.NurseVoAssembler.createNurseVoCollectionFromNurse(map, domainObject.getScrubNurse()) );
		// CirculatingNurse
		valueObject.setCirculatingNurse(ims.core.vo.domain.NurseVoAssembler.createNurseVoCollectionFromNurse(map, domainObject.getCirculatingNurse()) );
		// Other
		valueObject.setOther(domainObject.getOther());
		// SurgicalCheckListPerformed
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSurgicalCheckListPerformed();
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

			ims.core.vo.lookups.YesNo voLookup14 = new ims.core.vo.lookups.YesNo(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.core.vo.lookups.YesNo(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSurgicalCheckListPerformed(voLookup14);
		}
				// CheckListNotPerformedReason
		ims.domain.lookups.LookupInstance instance15 = domainObject.getCheckListNotPerformedReason();
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

			ims.clinical.vo.lookups.SurgicalCheckListNotPerformedReason voLookup15 = new ims.clinical.vo.lookups.SurgicalCheckListNotPerformedReason(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.clinical.vo.lookups.SurgicalCheckListNotPerformedReason parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.clinical.vo.lookups.SurgicalCheckListNotPerformedReason(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setCheckListNotPerformedReason(voLookup15);
		}
				// LocumAnaestNurse
		valueObject.setLocumAnaestNurse(domainObject.getLocumAnaestNurse());
		// LocumScrubNurse
		valueObject.setLocumScrubNurse(domainObject.getLocumScrubNurse());
		// LocumCirculatingNurse
		valueObject.setLocumCirculatingNurse(domainObject.getLocumCirculatingNurse());
		// Radiographers
		valueObject.setRadiographers(ims.core.vo.domain.HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(map, domainObject.getRadiographers()) );
		// AnaestheticUsed
		ims.domain.lookups.LookupInstance instance20 = domainObject.getAnaestheticUsed();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.AnaestheticType voLookup20 = new ims.clinical.vo.lookups.AnaestheticType(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setAnaestheticUsed(voLookup20);
		}
				// AnaestheticUsedComment
		valueObject.setAnaestheticUsedComment(domainObject.getAnaestheticUsedComment());
		// EnterOpTheatreTime
		java.util.Date EnterOpTheatreTime = domainObject.getEnterOpTheatreTime();
		if ( null != EnterOpTheatreTime ) 
		{
			valueObject.setEnterOpTheatreTime(new ims.framework.utils.DateTime(EnterOpTheatreTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditProcedureDetails extractSurgicalAuditProcedureDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObject) 
	{
		return 	extractSurgicalAuditProcedureDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditProcedureDetails extractSurgicalAuditProcedureDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditProcedureDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditProcedureDetails();
		ims.clinical.domain.objects.SurgicalAuditProcedureDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditProcedureDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditProcedureDetailsVo ID_SurgicalAuditProcedureDetails field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditProcedureDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditProcedureDetails());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditProcedureDetails)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditProcedureDetails) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditProcedureDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditProcedureDetails());

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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
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
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setAnaesthetistNotRequired(valueObject.getAnaesthetistNotRequired());

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.people.vo.MedicRefVoCollection refCollection5 = new ims.core.resource.people.vo.MedicRefVoCollection();
		if (valueObject.getAnaesthetists() != null)
		{
			for (int i5=0; i5<valueObject.getAnaesthetists().size(); i5++)
			{
				ims.core.resource.people.vo.MedicRefVo ref5 = (ims.core.resource.people.vo.MedicRefVo)valueObject.getAnaesthetists().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.List domainAnaesthetists5 = domainObject.getAnaesthetists();
		if (domainAnaesthetists5 == null)
		{
			domainAnaesthetists5 = new java.util.ArrayList();
		}
		for(int i=0; i < size5; i++) 
		{
			ims.core.resource.people.vo.MedicRefVo vo = refCollection5.get(i);			
			ims.core.resource.people.domain.objects.Medic dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.people.domain.objects.Medic)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.people.domain.objects.Medic)domainFactory.getDomainObject( ims.core.resource.people.domain.objects.Medic.class, vo.getBoId());
				}
			}

			int domIdx = domainAnaesthetists5.indexOf(dom);
			if (domIdx == -1)
			{
				domainAnaesthetists5.add(i, dom);
			}
			else if (i != domIdx && i < domainAnaesthetists5.size())
			{
				Object tmp = domainAnaesthetists5.get(i);
				domainAnaesthetists5.set(i, domainAnaesthetists5.get(domIdx));
				domainAnaesthetists5.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i5 = domainAnaesthetists5.size();
		while (i5 > size5)
		{
			domainAnaesthetists5.remove(i5-1);
			i5 = domainAnaesthetists5.size();
		}
		
		domainObject.setAnaesthetists(domainAnaesthetists5);		
		domainObject.setAnaesthetistAssistNotRequired(valueObject.getAnaesthetistAssistNotRequired());
		domainObject.setAnaesthetistAssistedBy(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicList(domainFactory, valueObject.getAnaesthetistAssistedBy(), domainObject.getAnaesthetistAssistedBy(), domMap));		
		domainObject.setOpPerformedBy(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicList(domainFactory, valueObject.getOpPerformedBy(), domainObject.getOpPerformedBy(), domMap));		
		domainObject.setConsultantAssistedBy(ims.core.vo.domain.MedicLiteVoAssembler.extractMedicList(domainFactory, valueObject.getConsultantAssistedBy(), domainObject.getConsultantAssistedBy(), domMap));		
		domainObject.setAnaestheticNurse(ims.core.vo.domain.NurseVoAssembler.extractNurseList(domainFactory, valueObject.getAnaestheticNurse(), domainObject.getAnaestheticNurse(), domMap));		
		domainObject.setScrubNurse(ims.core.vo.domain.NurseVoAssembler.extractNurseList(domainFactory, valueObject.getScrubNurse(), domainObject.getScrubNurse(), domMap));		
		domainObject.setCirculatingNurse(ims.core.vo.domain.NurseVoAssembler.extractNurseList(domainFactory, valueObject.getCirculatingNurse(), domainObject.getCirculatingNurse(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOther() != null && valueObject.getOther().equals(""))
		{
			valueObject.setOther(null);
		}
		domainObject.setOther(valueObject.getOther());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSurgicalCheckListPerformed() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSurgicalCheckListPerformed().getID());
		}
		domainObject.setSurgicalCheckListPerformed(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getCheckListNotPerformedReason() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getCheckListNotPerformedReason().getID());
		}
		domainObject.setCheckListNotPerformedReason(value15);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocumAnaestNurse() != null && valueObject.getLocumAnaestNurse().equals(""))
		{
			valueObject.setLocumAnaestNurse(null);
		}
		domainObject.setLocumAnaestNurse(valueObject.getLocumAnaestNurse());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocumScrubNurse() != null && valueObject.getLocumScrubNurse().equals(""))
		{
			valueObject.setLocumScrubNurse(null);
		}
		domainObject.setLocumScrubNurse(valueObject.getLocumScrubNurse());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocumCirculatingNurse() != null && valueObject.getLocumCirculatingNurse().equals(""))
		{
			valueObject.setLocumCirculatingNurse(null);
		}
		domainObject.setLocumCirculatingNurse(valueObject.getLocumCirculatingNurse());

		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.people.vo.HcpRefVoCollection refCollection19 = new ims.core.resource.people.vo.HcpRefVoCollection();
		if (valueObject.getRadiographers() != null)
		{
			for (int i19=0; i19<valueObject.getRadiographers().size(); i19++)
			{
				ims.core.resource.people.vo.HcpRefVo ref19 = (ims.core.resource.people.vo.HcpRefVo)valueObject.getRadiographers().get(i19);
				refCollection19.add(ref19);
			}
		}
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.List domainRadiographers19 = domainObject.getRadiographers();
		if (domainRadiographers19 == null)
		{
			domainRadiographers19 = new java.util.ArrayList();
		}
		for(int i=0; i < size19; i++) 
		{
			ims.core.resource.people.vo.HcpRefVo vo = refCollection19.get(i);			
			ims.core.resource.people.domain.objects.Hcp dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.people.domain.objects.Hcp)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject( ims.core.resource.people.domain.objects.Hcp.class, vo.getBoId());
				}
			}

			int domIdx = domainRadiographers19.indexOf(dom);
			if (domIdx == -1)
			{
				domainRadiographers19.add(i, dom);
			}
			else if (i != domIdx && i < domainRadiographers19.size())
			{
				Object tmp = domainRadiographers19.get(i);
				domainRadiographers19.set(i, domainRadiographers19.get(domIdx));
				domainRadiographers19.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i19 = domainRadiographers19.size();
		while (i19 > size19)
		{
			domainRadiographers19.remove(i19-1);
			i19 = domainRadiographers19.size();
		}
		
		domainObject.setRadiographers(domainRadiographers19);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getAnaestheticUsed() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticUsed().getID());
		}
		domainObject.setAnaestheticUsed(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAnaestheticUsedComment() != null && valueObject.getAnaestheticUsedComment().equals(""))
		{
			valueObject.setAnaestheticUsedComment(null);
		}
		domainObject.setAnaestheticUsedComment(valueObject.getAnaestheticUsedComment());
		ims.framework.utils.DateTime dateTime22 = valueObject.getEnterOpTheatreTime();
		java.util.Date value22 = null;
		if ( dateTime22 != null ) 
		{
			value22 = dateTime22.getJavaDate();
		}
		domainObject.setEnterOpTheatreTime(value22);

		return domainObject;
	}

}
