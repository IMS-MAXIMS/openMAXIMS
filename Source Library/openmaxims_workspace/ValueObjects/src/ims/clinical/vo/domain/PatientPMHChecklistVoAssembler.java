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
 * @author Billy Mahon
 */
public class PatientPMHChecklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.PatientPMHChecklistVo copy(ims.clinical.vo.PatientPMHChecklistVo valueObjectDest, ims.clinical.vo.PatientPMHChecklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientPMHChecklist(valueObjectSrc.getID_PatientPMHChecklist());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// PMHInfoText
		valueObjectDest.setPMHInfoText(valueObjectSrc.getPMHInfoText());
		// PresComplaint
		valueObjectDest.setPresComplaint(valueObjectSrc.getPresComplaint());
		// PositiveDiagnosis
		valueObjectDest.setPositiveDiagnosis(valueObjectSrc.getPositiveDiagnosis());
		// PositiveProcedure
		valueObjectDest.setPositiveProcedure(valueObjectSrc.getPositiveProcedure());
		// OtherDiagnosis
		valueObjectDest.setOtherDiagnosis(valueObjectSrc.getOtherDiagnosis());
		// OtherProcedure
		valueObjectDest.setOtherProcedure(valueObjectSrc.getOtherProcedure());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientPMHChecklist objects.
	 */
	public static ims.clinical.vo.PatientPMHChecklistVoCollection createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(java.util.Set domainObjectSet)	
	{
		return createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.PatientPMHChecklist objects.
	 */
	public static ims.clinical.vo.PatientPMHChecklistVoCollection createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.PatientPMHChecklistVoCollection voList = new ims.clinical.vo.PatientPMHChecklistVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.PatientPMHChecklist domainObject = (ims.clinical.domain.objects.PatientPMHChecklist) iterator.next();
			ims.clinical.vo.PatientPMHChecklistVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientPMHChecklist objects.
	 */
	public static ims.clinical.vo.PatientPMHChecklistVoCollection createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(java.util.List domainObjectList) 
	{
		return createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.PatientPMHChecklist objects.
	 */
	public static ims.clinical.vo.PatientPMHChecklistVoCollection createPatientPMHChecklistVoCollectionFromPatientPMHChecklist(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.PatientPMHChecklistVoCollection voList = new ims.clinical.vo.PatientPMHChecklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.PatientPMHChecklist domainObject = (ims.clinical.domain.objects.PatientPMHChecklist) domainObjectList.get(i);
			ims.clinical.vo.PatientPMHChecklistVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.PatientPMHChecklist set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientPMHChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVoCollection voCollection) 
	 {
	 	return extractPatientPMHChecklistSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientPMHChecklistSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientPMHChecklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientPMHChecklist domainObject = PatientPMHChecklistVoAssembler.extractPatientPMHChecklist(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.PatientPMHChecklist list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientPMHChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVoCollection voCollection) 
	 {
	 	return extractPatientPMHChecklistList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientPMHChecklistList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.PatientPMHChecklistVo vo = voCollection.get(i);
			ims.clinical.domain.objects.PatientPMHChecklist domainObject = PatientPMHChecklistVoAssembler.extractPatientPMHChecklist(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.PatientPMHChecklist object.
	 * @param domainObject ims.clinical.domain.objects.PatientPMHChecklist
	 */
	 public static ims.clinical.vo.PatientPMHChecklistVo create(ims.clinical.domain.objects.PatientPMHChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.PatientPMHChecklist object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.PatientPMHChecklistVo create(DomainObjectMap map, ims.clinical.domain.objects.PatientPMHChecklist domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.PatientPMHChecklistVo valueObject = (ims.clinical.vo.PatientPMHChecklistVo) map.getValueObject(domainObject, ims.clinical.vo.PatientPMHChecklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.PatientPMHChecklistVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.PatientPMHChecklist
	 */
	 public static ims.clinical.vo.PatientPMHChecklistVo insert(ims.clinical.vo.PatientPMHChecklistVo valueObject, ims.clinical.domain.objects.PatientPMHChecklist domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.PatientPMHChecklist
	 */
	 public static ims.clinical.vo.PatientPMHChecklistVo insert(DomainObjectMap map, ims.clinical.vo.PatientPMHChecklistVo valueObject, ims.clinical.domain.objects.PatientPMHChecklist domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientPMHChecklist(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// PMHInfoText
		valueObject.setPMHInfoText(domainObject.getPMHInfoText());
		// PresComplaint
		valueObject.setPresComplaint(domainObject.getPresComplaint());
		// PositiveDiagnosis
		valueObject.setPositiveDiagnosis(ims.core.vo.domain.PatientDiagnosisVoAssembler.createPatientDiagnosisVoCollectionFromPatientDiagnosis(map, domainObject.getPositiveDiagnosis()) );
		// PositiveProcedure
		valueObject.setPositiveProcedure(ims.core.vo.domain.PatientProcedureShortVoAssembler.createPatientProcedureShortVoCollectionFromPatientProcedure(map, domainObject.getPositiveProcedure()) );
		// OtherDiagnosis
		valueObject.setOtherDiagnosis(ims.clinical.vo.domain.PatientPMHChecklistDiagnosisVoAssembler.createPatientPMHChecklistDiagnosisVoCollectionFromPatientPMHChecklistDiagnosis(map, domainObject.getOtherDiagnosis()) );
		// OtherProcedure
		valueObject.setOtherProcedure(ims.clinical.vo.domain.PatientPMHChecklistProcedureVoAssembler.createPatientPMHChecklistProcedureVoCollectionFromPatientPMHChecklistProcedure(map, domainObject.getOtherProcedure()) );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.PatientPMHChecklist extractPatientPMHChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVo valueObject) 
	{
		return 	extractPatientPMHChecklist(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.PatientPMHChecklist extractPatientPMHChecklist(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.PatientPMHChecklistVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientPMHChecklist();
		ims.clinical.domain.objects.PatientPMHChecklist domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.PatientPMHChecklist)domMap.get(valueObject);
			}
			// ims.clinical.vo.PatientPMHChecklistVo ID_PatientPMHChecklist field is unknown
			domainObject = new ims.clinical.domain.objects.PatientPMHChecklist();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientPMHChecklist());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.PatientPMHChecklist)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.PatientPMHChecklist) domainFactory.getDomainObject(ims.clinical.domain.objects.PatientPMHChecklist.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientPMHChecklist());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPMHInfoText() != null && valueObject.getPMHInfoText().equals(""))
		{
			valueObject.setPMHInfoText(null);
		}
		domainObject.setPMHInfoText(valueObject.getPMHInfoText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPresComplaint() != null && valueObject.getPresComplaint().equals(""))
		{
			valueObject.setPresComplaint(null);
		}
		domainObject.setPresComplaint(valueObject.getPresComplaint());
		domainObject.setPositiveDiagnosis(ims.core.vo.domain.PatientDiagnosisVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getPositiveDiagnosis(), domainObject.getPositiveDiagnosis(), domMap));		
		domainObject.setPositiveProcedure(ims.core.vo.domain.PatientProcedureShortVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getPositiveProcedure(), domainObject.getPositiveProcedure(), domMap));		
		domainObject.setOtherDiagnosis(ims.clinical.vo.domain.PatientPMHChecklistDiagnosisVoAssembler.extractPatientPMHChecklistDiagnosisSet(domainFactory, valueObject.getOtherDiagnosis(), domainObject.getOtherDiagnosis(), domMap));		
		domainObject.setOtherProcedure(ims.clinical.vo.domain.PatientPMHChecklistProcedureVoAssembler.extractPatientPMHChecklistProcedureSet(domainFactory, valueObject.getOtherProcedure(), domainObject.getOtherProcedure(), domMap));		
		ims.core.admin.domain.objects.CareContext value8 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value8 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getCareContext();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value8);

		return domainObject;
	}

}
