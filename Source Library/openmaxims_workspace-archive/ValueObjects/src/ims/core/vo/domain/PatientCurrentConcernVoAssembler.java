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
 * @author Kevin O'Carroll
 */
public class PatientCurrentConcernVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCurrentConcernVo copy(ims.core.vo.PatientCurrentConcernVo valueObjectDest, ims.core.vo.PatientCurrentConcernVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientConcern(valueObjectSrc.getID_PatientConcern());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// assocProblem
		valueObjectDest.setAssocProblem(valueObjectSrc.getAssocProblem());
		// concernDescription
		valueObjectDest.setConcernDescription(valueObjectSrc.getConcernDescription());
		// dateTimeIdentified
		valueObjectDest.setDateTimeIdentified(valueObjectSrc.getDateTimeIdentified());
		// teamIdentified
		valueObjectDest.setTeamIdentified(valueObjectSrc.getTeamIdentified());
		// memberIdentified
		valueObjectDest.setMemberIdentified(valueObjectSrc.getMemberIdentified());
		// associatedNote
		valueObjectDest.setAssociatedNote(valueObjectSrc.getAssociatedNote());
		// allocatedToTeam
		valueObjectDest.setAllocatedToTeam(valueObjectSrc.getAllocatedToTeam());
		// allocToTeamMember
		valueObjectDest.setAllocToTeamMember(valueObjectSrc.getAllocToTeamMember());
		// dateTimeAllocated
		valueObjectDest.setDateTimeAllocated(valueObjectSrc.getDateTimeAllocated());
		// concernStatus
		valueObjectDest.setConcernStatus(valueObjectSrc.getConcernStatus());
		// RecordingHCP
		valueObjectDest.setRecordingHCP(valueObjectSrc.getRecordingHCP());
		// UpdatingHCP
		valueObjectDest.setUpdatingHCP(valueObjectSrc.getUpdatingHCP());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCurrentConcernVoCollectionFromPatientConcern(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientConcern objects.
	 */
	public static ims.core.vo.PatientCurrentConcernVoCollection createPatientCurrentConcernVoCollectionFromPatientConcern(java.util.Set domainObjectSet)	
	{
		return createPatientCurrentConcernVoCollectionFromPatientConcern(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientConcern objects.
	 */
	public static ims.core.vo.PatientCurrentConcernVoCollection createPatientCurrentConcernVoCollectionFromPatientConcern(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCurrentConcernVoCollection voList = new ims.core.vo.PatientCurrentConcernVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientConcern domainObject = (ims.core.clinical.domain.objects.PatientConcern) iterator.next();
			ims.core.vo.PatientCurrentConcernVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientConcern objects.
	 */
	public static ims.core.vo.PatientCurrentConcernVoCollection createPatientCurrentConcernVoCollectionFromPatientConcern(java.util.List domainObjectList) 
	{
		return createPatientCurrentConcernVoCollectionFromPatientConcern(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientConcern objects.
	 */
	public static ims.core.vo.PatientCurrentConcernVoCollection createPatientCurrentConcernVoCollectionFromPatientConcern(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCurrentConcernVoCollection voList = new ims.core.vo.PatientCurrentConcernVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientConcern domainObject = (ims.core.clinical.domain.objects.PatientConcern) domainObjectList.get(i);
			ims.core.vo.PatientCurrentConcernVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientConcern set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientConcernSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVoCollection voCollection) 
	 {
	 	return extractPatientConcernSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientConcernSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCurrentConcernVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientConcern domainObject = PatientCurrentConcernVoAssembler.extractPatientConcern(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientConcern list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientConcernList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVoCollection voCollection) 
	 {
	 	return extractPatientConcernList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientConcernList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCurrentConcernVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientConcern domainObject = PatientCurrentConcernVoAssembler.extractPatientConcern(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientConcern object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientConcern
	 */
	 public static ims.core.vo.PatientCurrentConcernVo create(ims.core.clinical.domain.objects.PatientConcern domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientConcern object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCurrentConcernVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientConcern domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCurrentConcernVo valueObject = (ims.core.vo.PatientCurrentConcernVo) map.getValueObject(domainObject, ims.core.vo.PatientCurrentConcernVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCurrentConcernVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientConcern
	 */
	 public static ims.core.vo.PatientCurrentConcernVo insert(ims.core.vo.PatientCurrentConcernVo valueObject, ims.core.clinical.domain.objects.PatientConcern domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientConcern
	 */
	 public static ims.core.vo.PatientCurrentConcernVo insert(DomainObjectMap map, ims.core.vo.PatientCurrentConcernVo valueObject, ims.core.clinical.domain.objects.PatientConcern domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientConcern(domainObject.getId());
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
			
		// assocProblem
		valueObject.setAssocProblem(ims.generalmedical.vo.domain.MedicalProbOnAdmisVoAssembler.createMedicalProbOnAdmisVoCollectionFromPatientProblem(map, domainObject.getAssocProblem()) );
		// concernDescription
		valueObject.setConcernDescription(domainObject.getConcernDescription());
		// dateTimeIdentified
		java.util.Date dateTimeIdentified = domainObject.getDateTimeIdentified();
		if ( null != dateTimeIdentified ) 
		{
			valueObject.setDateTimeIdentified(new ims.framework.utils.DateTime(dateTimeIdentified) );
		}
		// teamIdentified
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTeamIdentified();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.HcpDisType voLookup4 = new ims.core.vo.lookups.HcpDisType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.HcpDisType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTeamIdentified(voLookup4);
		}
				// memberIdentified
		valueObject.setMemberIdentified(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getMemberIdentified()) );
		// associatedNote
		valueObject.setAssociatedNote(domainObject.getAssociatedNote());
		// allocatedToTeam
		ims.domain.lookups.LookupInstance instance7 = domainObject.getAllocatedToTeam();
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

			ims.core.vo.lookups.HcpDisType voLookup7 = new ims.core.vo.lookups.HcpDisType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.HcpDisType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setAllocatedToTeam(voLookup7);
		}
				// allocToTeamMember
		valueObject.setAllocToTeamMember(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAllocToTeamMember()) );
		// dateTimeAllocated
		java.util.Date dateTimeAllocated = domainObject.getDateTimeAllocated();
		if ( null != dateTimeAllocated ) 
		{
			valueObject.setDateTimeAllocated(new ims.framework.utils.DateTime(dateTimeAllocated) );
		}
		// concernStatus
		ims.domain.lookups.LookupInstance instance10 = domainObject.getConcernStatus();
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

			ims.core.vo.lookups.PatientConcernStatus voLookup10 = new ims.core.vo.lookups.PatientConcernStatus(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.PatientConcernStatus parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.PatientConcernStatus(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setConcernStatus(voLookup10);
		}
				// RecordingHCP
		valueObject.setRecordingHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getRecordingHCP()) );
		// UpdatingHCP
		valueObject.setUpdatingHCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getUpdatingHCP()) );
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
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
	public static ims.core.clinical.domain.objects.PatientConcern extractPatientConcern(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVo valueObject) 
	{
		return 	extractPatientConcern(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientConcern extractPatientConcern(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCurrentConcernVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientConcern();
		ims.core.clinical.domain.objects.PatientConcern domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientConcern)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCurrentConcernVo ID_PatientConcern field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientConcern();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientConcern());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientConcern)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientConcern) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientConcern.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientConcern());

		domainObject.setAssocProblem(ims.generalmedical.vo.domain.MedicalProbOnAdmisVoAssembler.extractPatientProblemSet(domainFactory, valueObject.getAssocProblem(), domainObject.getAssocProblem(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConcernDescription() != null && valueObject.getConcernDescription().equals(""))
		{
			valueObject.setConcernDescription(null);
		}
		domainObject.setConcernDescription(valueObject.getConcernDescription());
		ims.framework.utils.DateTime dateTime3 = valueObject.getDateTimeIdentified();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setDateTimeIdentified(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTeamIdentified() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTeamIdentified().getID());
		}
		domainObject.setTeamIdentified(value4);
		domainObject.setMemberIdentified(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getMemberIdentified(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssociatedNote() != null && valueObject.getAssociatedNote().equals(""))
		{
			valueObject.setAssociatedNote(null);
		}
		domainObject.setAssociatedNote(valueObject.getAssociatedNote());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getAllocatedToTeam() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getAllocatedToTeam().getID());
		}
		domainObject.setAllocatedToTeam(value7);
		domainObject.setAllocToTeamMember(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAllocToTeamMember(), domMap));
		ims.framework.utils.DateTime dateTime9 = valueObject.getDateTimeAllocated();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setDateTimeAllocated(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getConcernStatus() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getConcernStatus().getID());
		}
		domainObject.setConcernStatus(value10);
		domainObject.setRecordingHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getRecordingHCP(), domMap));
		domainObject.setUpdatingHCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getUpdatingHCP(), domMap));
		ims.core.admin.domain.objects.CareContext value14 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value14 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getCareContext();	
			}
			else
			{
				value14 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value14);

		return domainObject;
	}

}
