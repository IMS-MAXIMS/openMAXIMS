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
public class SurgicalAuditPreOpChecksTheatreNurseVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo copy(ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObjectDest, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SurgicalAuditPreOpChecksTheatreNurse(valueObjectSrc.getID_SurgicalAuditPreOpChecksTheatreNurse());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// TheatreName
		valueObjectDest.setTheatreName(valueObjectSrc.getTheatreName());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// OperationType
		valueObjectDest.setOperationType(valueObjectSrc.getOperationType());
		// AccompanyingTheatreNurse
		valueObjectDest.setAccompanyingTheatreNurse(valueObjectSrc.getAccompanyingTheatreNurse());
		// AccompanyingTheatreNurseLocumBool
		valueObjectDest.setAccompanyingTheatreNurseLocumBool(valueObjectSrc.getAccompanyingTheatreNurseLocumBool());
		// AccompanyingTheatreNurseLocumNurse
		valueObjectDest.setAccompanyingTheatreNurseLocumNurse(valueObjectSrc.getAccompanyingTheatreNurseLocumNurse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(java.util.Set domainObjectSet)	
	{
		return createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voList = new ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse) iterator.next();
			ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(java.util.List domainObjectList) 
	{
		return createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse objects.
	 */
	public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection createSurgicalAuditPreOpChecksTheatreNurseVoCollectionFromSurgicalAuditPreOpChecksTheatreNurse(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voList = new ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse) domainObjectList.get(i);
			ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSurgicalAuditPreOpChecksTheatreNurseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditPreOpChecksTheatreNurseSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSurgicalAuditPreOpChecksTheatreNurseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject = SurgicalAuditPreOpChecksTheatreNurseVoAssembler.extractSurgicalAuditPreOpChecksTheatreNurse(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSurgicalAuditPreOpChecksTheatreNurseList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voCollection) 
	 {
	 	return extractSurgicalAuditPreOpChecksTheatreNurseList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSurgicalAuditPreOpChecksTheatreNurseList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject = SurgicalAuditPreOpChecksTheatreNurseVoAssembler.extractSurgicalAuditPreOpChecksTheatreNurse(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse object.
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo create(ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo create(DomainObjectMap map, ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObject = (ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo) map.getValueObject(domainObject, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo insert(ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObject, ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse
	 */
	 public static ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo insert(DomainObjectMap map, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObject, ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SurgicalAuditPreOpChecksTheatreNurse(domainObject.getId());
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
		// TheatreName
		valueObject.setTheatreName(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getTheatreName()) );
		// Comments
		valueObject.setComments(domainObject.getComments());
		// OperationType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getOperationType();
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

			ims.core.vo.lookups.ProcedureUrgency voLookup6 = new ims.core.vo.lookups.ProcedureUrgency(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureUrgency parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.ProcedureUrgency(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setOperationType(voLookup6);
		}
				// AccompanyingTheatreNurse
		valueObject.setAccompanyingTheatreNurse(ims.core.vo.domain.NurseVoAssembler.create(map, domainObject.getAccompanyingTheatreNurse()) );
		// AccompanyingTheatreNurseLocumBool
		valueObject.setAccompanyingTheatreNurseLocumBool( domainObject.isAccompanyingTheatreNurseLocumBool() );
		// AccompanyingTheatreNurseLocumNurse
		valueObject.setAccompanyingTheatreNurseLocumNurse(domainObject.getAccompanyingTheatreNurseLocumNurse());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse extractSurgicalAuditPreOpChecksTheatreNurse(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObject) 
	{
		return 	extractSurgicalAuditPreOpChecksTheatreNurse(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse extractSurgicalAuditPreOpChecksTheatreNurse(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SurgicalAuditPreOpChecksTheatreNurse();
		ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse)domMap.get(valueObject);
			}
			// ims.clinical.vo.SurgicalAuditPreOpChecksTheatreNurseVo ID_SurgicalAuditPreOpChecksTheatreNurse field is unknown
			domainObject = new ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SurgicalAuditPreOpChecksTheatreNurse());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse) domainFactory.getDomainObject(ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SurgicalAuditPreOpChecksTheatreNurse());

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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value4 = null;
		if ( null != valueObject.getTheatreName() ) 
		{
			if (valueObject.getTheatreName().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreName()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTheatreName());
				}
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTheatreName().getBoId());
			}
		}
		domainObject.setTheatreName(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getOperationType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getOperationType().getID());
		}
		domainObject.setOperationType(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Nurse value7 = null;
		if ( null != valueObject.getAccompanyingTheatreNurse() ) 
		{
			if (valueObject.getAccompanyingTheatreNurse().getBoId() == null)
			{
				if (domMap.get(valueObject.getAccompanyingTheatreNurse()) != null)
				{
					value7 = (ims.core.resource.people.domain.objects.Nurse)domMap.get(valueObject.getAccompanyingTheatreNurse());
				}
			}
			else
			{
				value7 = (ims.core.resource.people.domain.objects.Nurse)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Nurse.class, valueObject.getAccompanyingTheatreNurse().getBoId());
			}
		}
		domainObject.setAccompanyingTheatreNurse(value7);
		domainObject.setAccompanyingTheatreNurseLocumBool(valueObject.getAccompanyingTheatreNurseLocumBool());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccompanyingTheatreNurseLocumNurse() != null && valueObject.getAccompanyingTheatreNurseLocumNurse().equals(""))
		{
			valueObject.setAccompanyingTheatreNurseLocumNurse(null);
		}
		domainObject.setAccompanyingTheatreNurseLocumNurse(valueObject.getAccompanyingTheatreNurseLocumNurse());

		return domainObject;
	}

}
