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
 * @author Calin Perebiceanu
 */
public class SurgicalOperationNotesGeneralDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo copy(ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObjectDest, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalOperationNotes(valueObjectSrc.getID_SurgicalOperationNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ProceduresPerformed
		valueObjectDest.setProceduresPerformed(valueObjectSrc.getProceduresPerformed());
		// PatientDiagnoses
		valueObjectDest.setPatientDiagnoses(valueObjectSrc.getPatientDiagnoses());
		// MainProcedure
		valueObjectDest.setMainProcedure(valueObjectSrc.getMainProcedure());
		// PrincipalAnaesthetist
		valueObjectDest.setPrincipalAnaesthetist(valueObjectSrc.getPrincipalAnaesthetist());
		// ConsultantAnaesthetist
		valueObjectDest.setConsultantAnaesthetist(valueObjectSrc.getConsultantAnaesthetist());
		// AnaestheticGiven
		valueObjectDest.setAnaestheticGiven(valueObjectSrc.getAnaestheticGiven());
		// EstimatedDateOfDischarge
		valueObjectDest.setEstimatedDateOfDischarge(valueObjectSrc.getEstimatedDateOfDischarge());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(java.util.Set domainObjectSet)	
	{
		return createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voList = new ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) iterator.next();
			ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(java.util.List domainObjectList) 
	{
		return createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalOperationNotes objects.
	 */
	public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection createSurgicalOperationNotesGeneralDetailsVoCollectionFromSurgicalOperationNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voList = new ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) domainObjectList.get(i);
			ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalOperationNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalOperationNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voCollection) 
	 {
	 	return extractSurgicalOperationNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalOperationNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = SurgicalOperationNotesGeneralDetailsVoAssembler.extractSurgicalOperationNotes(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalOperationNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalOperationNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voCollection) 
	 {
	 	return extractSurgicalOperationNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalOperationNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalOperationNotes domainObject = SurgicalOperationNotesGeneralDetailsVoAssembler.extractSurgicalOperationNotes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalOperationNotes object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo create(ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalOperationNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObject = (ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo insert(ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObject, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalOperationNotes
	 */
	 public static ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObject, ims.clinical.domain.objects.SurgicalOperationNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalOperationNotes(domainObject.getId());
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
			
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
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
		// ProceduresPerformed
		valueObject.setProceduresPerformed(ims.core.vo.domain.PatientProcedureSurgicalOpVoAssembler.createPatientProcedureSurgicalOpVoCollectionFromPatientProcedure(map, domainObject.getProceduresPerformed()) );
		// PatientDiagnoses
		valueObject.setPatientDiagnoses(ims.clinical.vo.domain.PatientDiagnosisOpNotesVoAssembler.createPatientDiagnosisOpNotesVoCollectionFromPatientDiagnosis(map, domainObject.getPatientDiagnoses()) );
		// MainProcedure
		valueObject.setMainProcedure(ims.core.vo.domain.PatientProcedureSurgicalOpVoAssembler.create(map, domainObject.getMainProcedure()) );
		// PrincipalAnaesthetist
		valueObject.setPrincipalAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getPrincipalAnaesthetist()) );
		// ConsultantAnaesthetist
		valueObject.setConsultantAnaesthetist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultantAnaesthetist()) );
		// AnaestheticGiven
		ims.domain.lookups.LookupInstance instance8 = domainObject.getAnaestheticGiven();
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

			ims.clinical.vo.lookups.AnaestheticType voLookup8 = new ims.clinical.vo.lookups.AnaestheticType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setAnaestheticGiven(voLookup8);
		}
				// EstimatedDateOfDischarge
		java.util.Date EstimatedDateOfDischarge = domainObject.getEstimatedDateOfDischarge();
		if ( null != EstimatedDateOfDischarge ) 
		{
			valueObject.setEstimatedDateOfDischarge(new ims.framework.utils.Date(EstimatedDateOfDischarge) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalOperationNotes extractSurgicalOperationNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObject) 
	{
		return 	extractSurgicalOperationNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalOperationNotes extractSurgicalOperationNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalOperationNotes();
		ims.clinical.domain.objects.SurgicalOperationNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalOperationNotes)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalOperationNotesGeneralDetailsVo ID_SurgicalOperationNotes field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalOperationNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalOperationNotes());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalOperationNotes)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalOperationNotes) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalOperationNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalOperationNotes());

		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
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
		domainObject.setProceduresPerformed(ims.core.vo.domain.PatientProcedureSurgicalOpVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getProceduresPerformed(), domainObject.getProceduresPerformed(), domMap));		
		domainObject.setPatientDiagnoses(ims.clinical.vo.domain.PatientDiagnosisOpNotesVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getPatientDiagnoses(), domainObject.getPatientDiagnoses(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.PatientProcedure value5 = null;
		if ( null != valueObject.getMainProcedure() ) 
		{
			if (valueObject.getMainProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getMainProcedure()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.PatientProcedure)domMap.get(valueObject.getMainProcedure());
				}
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.PatientProcedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientProcedure.class, valueObject.getMainProcedure().getBoId());
			}
		}
		domainObject.setMainProcedure(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getPrincipalAnaesthetist() ) 
		{
			if (valueObject.getPrincipalAnaesthetist().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrincipalAnaesthetist()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getPrincipalAnaesthetist());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getPrincipalAnaesthetist().getBoId());
			}
		}
		domainObject.setPrincipalAnaesthetist(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value7 = null;
		if ( null != valueObject.getConsultantAnaesthetist() ) 
		{
			if (valueObject.getConsultantAnaesthetist().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultantAnaesthetist()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultantAnaesthetist());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultantAnaesthetist().getBoId());
			}
		}
		domainObject.setConsultantAnaesthetist(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getAnaestheticGiven() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getAnaestheticGiven().getID());
		}
		domainObject.setAnaestheticGiven(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getEstimatedDateOfDischarge();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setEstimatedDateOfDischarge(value9);

		return domainObject;
	}

}
