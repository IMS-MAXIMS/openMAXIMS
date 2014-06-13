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
 * @author Rory Fitzpatrick
 */
public class SurgeryDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgeryDetailsVo copy(ims.clinical.vo.SurgeryDetailsVo valueObjectDest, ims.clinical.vo.SurgeryDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgeryDetails(valueObjectSrc.getID_SurgeryDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// PatientProcedure
		valueObjectDest.setPatientProcedure(valueObjectSrc.getPatientProcedure());
		// HospitalPerformed
		valueObjectDest.setHospitalPerformed(valueObjectSrc.getHospitalPerformed());
		// ResponsibleConsultant
		valueObjectDest.setResponsibleConsultant(valueObjectSrc.getResponsibleConsultant());
		// SpecialtyFunctionCode
		valueObjectDest.setSpecialtyFunctionCode(valueObjectSrc.getSpecialtyFunctionCode());
		// AdmissionDate
		valueObjectDest.setAdmissionDate(valueObjectSrc.getAdmissionDate());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DischargeDestination
		valueObjectDest.setDischargeDestination(valueObjectSrc.getDischargeDestination());
		// ASAGrade
		valueObjectDest.setASAGrade(valueObjectSrc.getASAGrade());
		// ConsultantPresence
		valueObjectDest.setConsultantPresence(valueObjectSrc.getConsultantPresence());
		// SubProcedures
		valueObjectDest.setSubProcedures(valueObjectSrc.getSubProcedures());
		// Anaesthetist
		valueObjectDest.setAnaesthetist(valueObjectSrc.getAnaesthetist());
		// AnaesthetistGrade
		valueObjectDest.setAnaesthetistGrade(valueObjectSrc.getAnaesthetistGrade());
		// Assistants
		valueObjectDest.setAssistants(valueObjectSrc.getAssistants());
		// ProcedureType
		valueObjectDest.setProcedureType(valueObjectSrc.getProcedureType());
		// PreOpPossum
		valueObjectDest.setPreOpPossum(valueObjectSrc.getPreOpPossum());
		// OperativeDetailsPossum
		valueObjectDest.setOperativeDetailsPossum(valueObjectSrc.getOperativeDetailsPossum());
		// OperativeFindings
		valueObjectDest.setOperativeFindings(valueObjectSrc.getOperativeFindings());
		// ProcedureDetails
		valueObjectDest.setProcedureDetails(valueObjectSrc.getProcedureDetails());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgeryDetailsVoCollectionFromSurgeryDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgeryDetails objects.
	 */
	public static ims.clinical.vo.SurgeryDetailsVoCollection createSurgeryDetailsVoCollectionFromSurgeryDetails(java.util.Set domainObjectSet)	
	{
		return createSurgeryDetailsVoCollectionFromSurgeryDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgeryDetails objects.
	 */
	public static ims.clinical.vo.SurgeryDetailsVoCollection createSurgeryDetailsVoCollectionFromSurgeryDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgeryDetailsVoCollection voList = new ims.clinical.vo.SurgeryDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgeryDetails domainObject = (ims.clinical.domain.objects.SurgeryDetails) iterator.next();
			ims.clinical.vo.SurgeryDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgeryDetails objects.
	 */
	public static ims.clinical.vo.SurgeryDetailsVoCollection createSurgeryDetailsVoCollectionFromSurgeryDetails(java.util.List domainObjectList) 
	{
		return createSurgeryDetailsVoCollectionFromSurgeryDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgeryDetails objects.
	 */
	public static ims.clinical.vo.SurgeryDetailsVoCollection createSurgeryDetailsVoCollectionFromSurgeryDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgeryDetailsVoCollection voList = new ims.clinical.vo.SurgeryDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgeryDetails domainObject = (ims.clinical.domain.objects.SurgeryDetails) domainObjectList.get(i);
			ims.clinical.vo.SurgeryDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgeryDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgeryDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVoCollection voCollection) 
	 {
	 	return extractSurgeryDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgeryDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgeryDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgeryDetails domainObject = SurgeryDetailsVoAssembler.extractSurgeryDetails(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgeryDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgeryDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVoCollection voCollection) 
	 {
	 	return extractSurgeryDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgeryDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgeryDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgeryDetails domainObject = SurgeryDetailsVoAssembler.extractSurgeryDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgeryDetails object.
	 * @param domainObject ims.clinical.domain.objects.SurgeryDetails
	 */
	 public static ims.clinical.vo.SurgeryDetailsVo create(ims.clinical.domain.objects.SurgeryDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgeryDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgeryDetailsVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgeryDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgeryDetailsVo valueObject = (ims.clinical.vo.SurgeryDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.SurgeryDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgeryDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgeryDetails
	 */
	 public static ims.clinical.vo.SurgeryDetailsVo insert(ims.clinical.vo.SurgeryDetailsVo valueObject, ims.clinical.domain.objects.SurgeryDetails domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgeryDetails
	 */
	 public static ims.clinical.vo.SurgeryDetailsVo insert(DomainObjectMap map, ims.clinical.vo.SurgeryDetailsVo valueObject, ims.clinical.domain.objects.SurgeryDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgeryDetails(domainObject.getId());
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
		// PatientProcedure
		valueObject.setPatientProcedure(ims.core.vo.domain.PatientProcedureVoAssembler.create(map, domainObject.getPatientProcedure()) );
		// HospitalPerformed
		valueObject.setHospitalPerformed(ims.core.vo.domain.OrgLiteVoAssembler.create(map, domainObject.getHospitalPerformed()) );
		// ResponsibleConsultant
		valueObject.setResponsibleConsultant((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleConsultant()) );
		// SpecialtyFunctionCode
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSpecialtyFunctionCode();
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

			ims.clinical.vo.lookups.SpecialtyFunctionCode voLookup5 = new ims.clinical.vo.lookups.SpecialtyFunctionCode(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.SpecialtyFunctionCode parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.SpecialtyFunctionCode(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSpecialtyFunctionCode(voLookup5);
		}
				// AdmissionDate
		java.util.Date AdmissionDate = domainObject.getAdmissionDate();
		if ( null != AdmissionDate ) 
		{
			valueObject.setAdmissionDate(new ims.framework.utils.Date(AdmissionDate) );
		}
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DischargeDestination
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDischargeDestination();
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

			ims.clinical.vo.lookups.SurgeryDischargeDestination voLookup8 = new ims.clinical.vo.lookups.SurgeryDischargeDestination(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.SurgeryDischargeDestination parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.SurgeryDischargeDestination(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDischargeDestination(voLookup8);
		}
				// ASAGrade
		ims.domain.lookups.LookupInstance instance9 = domainObject.getASAGrade();
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

			ims.core.vo.lookups.SurgeryASAGrade voLookup9 = new ims.core.vo.lookups.SurgeryASAGrade(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.SurgeryASAGrade parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.SurgeryASAGrade(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setASAGrade(voLookup9);
		}
				// ConsultantPresence
		ims.domain.lookups.LookupInstance instance10 = domainObject.getConsultantPresence();
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

			ims.core.vo.lookups.ConsultantPresence voLookup10 = new ims.core.vo.lookups.ConsultantPresence(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.ConsultantPresence parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.ConsultantPresence(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setConsultantPresence(voLookup10);
		}
				// SubProcedures
		valueObject.setSubProcedures(ims.clinical.vo.domain.SubProceduresVoAssembler.createSubProceduresVoCollectionFromSubProcedures(map, domainObject.getSubProcedures()) );
		// Anaesthetist
		valueObject.setAnaesthetist((ims.core.vo.HcpLiteVo)ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getAnaesthetist()) );
		// AnaesthetistGrade
		ims.domain.lookups.LookupInstance instance13 = domainObject.getAnaesthetistGrade();
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

			ims.core.vo.lookups.MedicGrade voLookup13 = new ims.core.vo.lookups.MedicGrade(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.MedicGrade parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.MedicGrade(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setAnaesthetistGrade(voLookup13);
		}
				// Assistants
		valueObject.setAssistants(ims.clinical.vo.domain.SurgeryAssistantsVoAssembler.createSurgeryAssistantsVoCollectionFromSurgeryAssistants(map, domainObject.getAssistants()) );
		// ProcedureType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getProcedureType();
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

			ims.core.vo.lookups.ProcedureType voLookup15 = new ims.core.vo.lookups.ProcedureType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureType parentVoLookup15 = voLookup15;
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
								parentVoLookup15.setParent(new ims.core.vo.lookups.ProcedureType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setProcedureType(voLookup15);
		}
				// PreOpPossum
		valueObject.setPreOpPossum(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getPreOpPossum()) );
		// OperativeDetailsPossum
		valueObject.setOperativeDetailsPossum(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getOperativeDetailsPossum()) );
		// OperativeFindings
		valueObject.setOperativeFindings(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getOperativeFindings()) );
		// ProcedureDetails
		valueObject.setProcedureDetails(ims.assessment.vo.domain.PatientAssessmentVoAssembler.create(map, domainObject.getProcedureDetails()) );
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgeryDetails extractSurgeryDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVo valueObject) 
	{
		return 	extractSurgeryDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgeryDetails extractSurgeryDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgeryDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgeryDetails();
		ims.clinical.domain.objects.SurgeryDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgeryDetails)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgeryDetailsVo ID_SurgeryDetails field is unknown
			domainObject = new ims.clinical.domain.objects.SurgeryDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgeryDetails());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgeryDetails)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgeryDetails) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgeryDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgeryDetails());

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
		domainObject.setPatientProcedure(ims.core.vo.domain.PatientProcedureVoAssembler.extractPatientProcedure(domainFactory, valueObject.getPatientProcedure(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Organisation value3 = null;
		if ( null != valueObject.getHospitalPerformed() ) 
		{
			if (valueObject.getHospitalPerformed().getBoId() == null)
			{
				if (domMap.get(valueObject.getHospitalPerformed()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Organisation)domMap.get(valueObject.getHospitalPerformed());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Organisation)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Organisation.class, valueObject.getHospitalPerformed().getBoId());
			}
		}
		domainObject.setHospitalPerformed(value3);
		domainObject.setResponsibleConsultant(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getResponsibleConsultant(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSpecialtyFunctionCode() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSpecialtyFunctionCode().getID());
		}
		domainObject.setSpecialtyFunctionCode(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getAdmissionDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setAdmissionDate(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDischargeDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDischargeDate(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDischargeDestination() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDischargeDestination().getID());
		}
		domainObject.setDischargeDestination(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getASAGrade() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getASAGrade().getID());
		}
		domainObject.setASAGrade(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getConsultantPresence() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getConsultantPresence().getID());
		}
		domainObject.setConsultantPresence(value10);
		domainObject.setSubProcedures(ims.clinical.vo.domain.SubProceduresVoAssembler.extractSubProceduresSet(domainFactory, valueObject.getSubProcedures(), domainObject.getSubProcedures(), domMap));		
		domainObject.setAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, (ims.core.vo.HcpLiteVo)valueObject.getAnaesthetist(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getAnaesthetistGrade() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getAnaesthetistGrade().getID());
		}
		domainObject.setAnaesthetistGrade(value13);
		domainObject.setAssistants(ims.clinical.vo.domain.SurgeryAssistantsVoAssembler.extractSurgeryAssistantsSet(domainFactory, valueObject.getAssistants(), domainObject.getAssistants(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getProcedureType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getProcedureType().getID());
		}
		domainObject.setProcedureType(value15);
		domainObject.setPreOpPossum(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getPreOpPossum(), domMap));
		domainObject.setOperativeDetailsPossum(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getOperativeDetailsPossum(), domMap));
		domainObject.setOperativeFindings(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getOperativeFindings(), domMap));
		domainObject.setProcedureDetails(ims.assessment.vo.domain.PatientAssessmentVoAssembler.extractPatientAssessment(domainFactory, valueObject.getProcedureDetails(), domMap));
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.admin.domain.objects.EpisodeOfCare value21 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value21 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value21 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value21 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value21);

		return domainObject;
	}

}
