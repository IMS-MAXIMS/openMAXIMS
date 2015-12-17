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
 * @author Florin Blindu
 */
public class SurgicalAuditOperationDetailVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditOperationDetailVo copy(ims.clinical.vo.SurgicalAuditOperationDetailVo valueObjectDest, ims.clinical.vo.SurgicalAuditOperationDetailVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditOperationDetail(valueObjectSrc.getID_SurgicalAuditOperationDetail());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// PreOpChecks
		valueObjectDest.setPreOpChecks(valueObjectSrc.getPreOpChecks());
		// PreOpChecksTheatreNurse
		valueObjectDest.setPreOpChecksTheatreNurse(valueObjectSrc.getPreOpChecksTheatreNurse());
		// ProcedureDetails
		valueObjectDest.setProcedureDetails(valueObjectSrc.getProcedureDetails());
		// ActualProcedure
		valueObjectDest.setActualProcedure(valueObjectSrc.getActualProcedure());
		// Recovery
		valueObjectDest.setRecovery(valueObjectSrc.getRecovery());
		// OperationCancelled
		valueObjectDest.setOperationCancelled(valueObjectSrc.getOperationCancelled());
		// ReasonForCancellation
		valueObjectDest.setReasonForCancellation(valueObjectSrc.getReasonForCancellation());
		// ReasonForCancellationComment
		valueObjectDest.setReasonForCancellationComment(valueObjectSrc.getReasonForCancellationComment());
		// OperationCancelledBy
		valueObjectDest.setOperationCancelledBy(valueObjectSrc.getOperationCancelledBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditOperationDetailVoCollection createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditOperationDetailVoCollection createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voList = new ims.clinical.vo.SurgicalAuditOperationDetailVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) iterator.next();
			ims.clinical.vo.SurgicalAuditOperationDetailVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditOperationDetailVoCollection createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(java.util.List domainObjectList) 
	{
		return createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditOperationDetail objects.
	 */
	public static ims.clinical.vo.SurgicalAuditOperationDetailVoCollection createSurgicalAuditOperationDetailVoCollectionFromSurgicalAuditOperationDetail(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voList = new ims.clinical.vo.SurgicalAuditOperationDetailVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditOperationDetailVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditOperationDetail set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditOperationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditOperationDetailSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditOperationDetailSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditOperationDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = SurgicalAuditOperationDetailVoAssembler.extractSurgicalAuditOperationDetail(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditOperationDetail list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditOperationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditOperationDetailList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditOperationDetailList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditOperationDetailVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = SurgicalAuditOperationDetailVoAssembler.extractSurgicalAuditOperationDetail(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditOperationDetail object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditOperationDetailVo create(ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditOperationDetail object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditOperationDetailVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditOperationDetailVo valueObject = (ims.clinical.vo.SurgicalAuditOperationDetailVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditOperationDetailVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditOperationDetailVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditOperationDetailVo insert(ims.clinical.vo.SurgicalAuditOperationDetailVo valueObject, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditOperationDetail
	 */
	 public static ims.clinical.vo.SurgicalAuditOperationDetailVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditOperationDetailVo valueObject, ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditOperationDetail(domainObject.getId());
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
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.SurgicalAuditOperationDetailStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.clinical.vo.domain.SurgicalAuditOperationDetailStatusVoAssembler.createSurgicalAuditOperationDetailStatusVoCollectionFromSurgicalAuditOperationDetailStatus(map, domainObject.getStatusHistory()) );
		// PreOpChecks
		valueObject.setPreOpChecks(ims.clinical.vo.domain.SurgicalAuditPreOpChecksVoAssembler.create(map, domainObject.getPreOpChecks()) );
		// PreOpChecksTheatreNurse
		valueObject.setPreOpChecksTheatreNurse(ims.clinical.vo.domain.SurgicalAuditPreOpChecksTheatreNurseVoAssembler.create(map, domainObject.getPreOpChecksTheatreNurse()) );
		// ProcedureDetails
		valueObject.setProcedureDetails(ims.clinical.vo.domain.SurgicalAuditProcedureDetailsVoAssembler.create(map, domainObject.getProcedureDetails()) );
		// ActualProcedure
		valueObject.setActualProcedure(ims.clinical.vo.domain.SurgicalAuditActualProcedureVoAssembler.create(map, domainObject.getActualProcedure()) );
		// Recovery
		valueObject.setRecovery(ims.clinical.vo.domain.SurgicalAuditRecoveryVoAssembler.create(map, domainObject.getRecovery()) );
		// OperationCancelled
		valueObject.setOperationCancelled( domainObject.isOperationCancelled() );
		// ReasonForCancellation
		ims.domain.lookups.LookupInstance instance12 = domainObject.getReasonForCancellation();
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

			ims.clinical.vo.lookups.OperationCancellationReason voLookup12 = new ims.clinical.vo.lookups.OperationCancellationReason(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.clinical.vo.lookups.OperationCancellationReason parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.clinical.vo.lookups.OperationCancellationReason(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setReasonForCancellation(voLookup12);
		}
				// ReasonForCancellationComment
		valueObject.setReasonForCancellationComment(domainObject.getReasonForCancellationComment());
		// OperationCancelledBy
		valueObject.setOperationCancelledBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getOperationCancelledBy()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditOperationDetail extractSurgicalAuditOperationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVo valueObject) 
	{
		return 	extractSurgicalAuditOperationDetail(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditOperationDetail extractSurgicalAuditOperationDetail(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditOperationDetailVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditOperationDetail();
		ims.clinical.domain.objects.SurgicalAuditOperationDetail domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditOperationDetail)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditOperationDetailVo ID_SurgicalAuditOperationDetail field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditOperationDetail();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditOperationDetail());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditOperationDetail)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditOperationDetail) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditOperationDetail.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditOperationDetail());

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
		domainObject.setCurrentStatus(ims.clinical.vo.domain.SurgicalAuditOperationDetailStatusVoAssembler.extractSurgicalAuditOperationDetailStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setStatusHistory(ims.clinical.vo.domain.SurgicalAuditOperationDetailStatusVoAssembler.extractSurgicalAuditOperationDetailStatusList(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		domainObject.setPreOpChecks(ims.clinical.vo.domain.SurgicalAuditPreOpChecksVoAssembler.extractSurgicalAuditPreOpChecks(domainFactory, valueObject.getPreOpChecks(), domMap));
		domainObject.setPreOpChecksTheatreNurse(ims.clinical.vo.domain.SurgicalAuditPreOpChecksTheatreNurseVoAssembler.extractSurgicalAuditPreOpChecksTheatreNurse(domainFactory, valueObject.getPreOpChecksTheatreNurse(), domMap));
		domainObject.setProcedureDetails(ims.clinical.vo.domain.SurgicalAuditProcedureDetailsVoAssembler.extractSurgicalAuditProcedureDetails(domainFactory, valueObject.getProcedureDetails(), domMap));
		domainObject.setActualProcedure(ims.clinical.vo.domain.SurgicalAuditActualProcedureVoAssembler.extractSurgicalAuditActualProcedure(domainFactory, valueObject.getActualProcedure(), domMap));
		domainObject.setRecovery(ims.clinical.vo.domain.SurgicalAuditRecoveryVoAssembler.extractSurgicalAuditRecovery(domainFactory, valueObject.getRecovery(), domMap));
		domainObject.setOperationCancelled(valueObject.getOperationCancelled());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getReasonForCancellation() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getReasonForCancellation().getID());
		}
		domainObject.setReasonForCancellation(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForCancellationComment() != null && valueObject.getReasonForCancellationComment().equals(""))
		{
			valueObject.setReasonForCancellationComment(null);
		}
		domainObject.setReasonForCancellationComment(valueObject.getReasonForCancellationComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value14 = null;
		if ( null != valueObject.getOperationCancelledBy() ) 
		{
			if (valueObject.getOperationCancelledBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getOperationCancelledBy()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getOperationCancelledBy());
				}
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getOperationCancelledBy().getBoId());
			}
		}
		domainObject.setOperationCancelledBy(value14);

		return domainObject;
	}

}
