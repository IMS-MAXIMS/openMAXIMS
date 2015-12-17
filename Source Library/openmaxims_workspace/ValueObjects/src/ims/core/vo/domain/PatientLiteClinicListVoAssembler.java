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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class PatientLiteClinicListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientLiteClinicListVo copy(ims.core.vo.PatientLiteClinicListVo valueObjectDest, ims.core.vo.PatientLiteClinicListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Patient(valueObjectSrc.getID_Patient());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// PatientCategory
		valueObjectDest.setPatientCategory(valueObjectSrc.getPatientCategory());
		// PatientAlerts
		valueObjectDest.setPatientAlerts(valueObjectSrc.getPatientAlerts());
		// associatedPatient
		valueObjectDest.setAssociatedPatient(valueObjectSrc.getAssociatedPatient());
		// ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// TimeOfDeath
		valueObjectDest.setTimeOfDeath(valueObjectSrc.getTimeOfDeath());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// sex
		valueObjectDest.setSex(valueObjectSrc.getSex());
		// dob
		valueObjectDest.setDob(valueObjectSrc.getDob());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// IsQuickRegistrationPatient
		valueObjectDest.setIsQuickRegistrationPatient(valueObjectSrc.getIsQuickRegistrationPatient());
		// primaryIdValueUsed
		valueObjectDest.setPrimaryIdValueUsed(valueObjectSrc.getPrimaryIdValueUsed());
		// identifiers
		valueObjectDest.setIdentifiers(valueObjectSrc.getIdentifiers());
		// dod
		valueObjectDest.setDod(valueObjectSrc.getDod());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientLiteClinicListVoCollectionFromPatient(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientLiteClinicListVoCollection createPatientLiteClinicListVoCollectionFromPatient(java.util.Set domainObjectSet)	
	{
		return createPatientLiteClinicListVoCollectionFromPatient(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientLiteClinicListVoCollection createPatientLiteClinicListVoCollectionFromPatient(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientLiteClinicListVoCollection voList = new ims.core.vo.PatientLiteClinicListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) iterator.next();
			ims.core.vo.PatientLiteClinicListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientLiteClinicListVoCollection createPatientLiteClinicListVoCollectionFromPatient(java.util.List domainObjectList) 
	{
		return createPatientLiteClinicListVoCollectionFromPatient(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.Patient objects.
	 */
	public static ims.core.vo.PatientLiteClinicListVoCollection createPatientLiteClinicListVoCollectionFromPatient(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientLiteClinicListVoCollection voList = new ims.core.vo.PatientLiteClinicListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.Patient domainObject = (ims.core.patient.domain.objects.Patient) domainObjectList.get(i);
			ims.core.vo.PatientLiteClinicListVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.Patient set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVoCollection voCollection) 
	 {
	 	return extractPatientSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientLiteClinicListVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientLiteClinicListVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.Patient list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVoCollection voCollection) 
	 {
	 	return extractPatientList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientLiteClinicListVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.Patient domainObject = PatientLiteClinicListVoAssembler.extractPatient(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientLiteClinicListVo create(ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.Patient object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientLiteClinicListVo create(DomainObjectMap map, ims.core.patient.domain.objects.Patient domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientLiteClinicListVo valueObject = (ims.core.vo.PatientLiteClinicListVo) map.getValueObject(domainObject, ims.core.vo.PatientLiteClinicListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientLiteClinicListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientLiteClinicListVo insert(ims.core.vo.PatientLiteClinicListVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.Patient
	 */
	 public static ims.core.vo.PatientLiteClinicListVo insert(DomainObjectMap map, ims.core.vo.PatientLiteClinicListVo valueObject, ims.core.patient.domain.objects.Patient domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Patient(domainObject.getId());
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
			
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelsLiteVoAssembler.createCommChannelsLiteVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// PatientCategory
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientCategory();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PatientStatus voLookup2 = new ims.core.vo.lookups.PatientStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PatientStatus parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.core.vo.lookups.PatientStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientCategory(voLookup2);
		}
				// PatientAlerts
		ims.core.clinical.vo.PatientAlertRefVoCollection PatientAlerts = new ims.core.clinical.vo.PatientAlertRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getPatientAlerts().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.PatientAlert tmp = (ims.core.clinical.domain.objects.PatientAlert)iterator.next();
			if (tmp != null)
				PatientAlerts.add(new ims.core.clinical.vo.PatientAlertRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setPatientAlerts(PatientAlerts);
		// associatedPatient
		if (domainObject.getAssociatedPatient() != null)
		{
			if(domainObject.getAssociatedPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAssociatedPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAssociatedPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setAssociatedPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getAssociatedPatient().getId(), domainObject.getAssociatedPatient().getVersion()));
			}
		}
		// ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// TimeOfDeath
		String TimeOfDeath = domainObject.getTimeOfDeath();
		if ( null != TimeOfDeath ) 
		{
			valueObject.setTimeOfDeath(new ims.framework.utils.Time(TimeOfDeath) );
		}
		// name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// sex
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSex();
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

			ims.core.vo.lookups.Sex voLookup8 = new ims.core.vo.lookups.Sex(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.Sex(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSex(voLookup8);
		}
				// dob
		Integer dob = domainObject.getDob();
		if ( null != dob ) 
		{
			valueObject.setDob(new ims.framework.utils.PartialDate(dob) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// IsQuickRegistrationPatient
		valueObject.setIsQuickRegistrationPatient( domainObject.isIsQuickRegistrationPatient() );
		// primaryIdValueUsed
		valueObject.setPrimaryIdValueUsed(domainObject.getPrimaryIdValueUsed());
		// identifiers
		valueObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.createPatientIdCollectionFromPatientId(map, domainObject.getIdentifiers()) );
		// dod
		java.util.Date dod = domainObject.getDod();
		if ( null != dod ) 
		{
			valueObject.setDod(new ims.framework.utils.Date(dod) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVo valueObject) 
	{
		return 	extractPatient(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.Patient extractPatient(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientLiteClinicListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Patient();
		ims.core.patient.domain.objects.Patient domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(valueObject);
			}
			// ims.core.vo.PatientLiteClinicListVo ID_Patient field is unknown
			domainObject = new ims.core.patient.domain.objects.Patient();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Patient());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.Patient)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.Patient) domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Patient());


		// SaveAsRefVO treated as RefValueObject
		ims.core.generic.vo.CommunicationChannelRefVoCollection refCollection1 = new ims.core.generic.vo.CommunicationChannelRefVoCollection();
		if (valueObject.getCommChannels() != null)
		{
			for (int i1=0; i1<valueObject.getCommChannels().size(); i1++)
			{
				ims.core.generic.vo.CommunicationChannelRefVo ref1 = (ims.core.generic.vo.CommunicationChannelRefVo)valueObject.getCommChannels().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.List domainCommChannels1 = domainObject.getCommChannels();
		if (domainCommChannels1 == null)
		{
			domainCommChannels1 = new java.util.ArrayList();
		}
		for(int i=0; i < size1; i++) 
		{
			ims.core.generic.vo.CommunicationChannelRefVo vo = refCollection1.get(i);			
			ims.core.generic.domain.objects.CommunicationChannel dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.generic.domain.objects.CommunicationChannel)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.generic.domain.objects.CommunicationChannel)domainFactory.getDomainObject( ims.core.generic.domain.objects.CommunicationChannel.class, vo.getBoId());
				}
			}

			int domIdx = domainCommChannels1.indexOf(dom);
			if (domIdx == -1)
			{
				domainCommChannels1.add(i, dom);
			}
			else if (i != domIdx && i < domainCommChannels1.size())
			{
				Object tmp = domainCommChannels1.get(i);
				domainCommChannels1.set(i, domainCommChannels1.get(domIdx));
				domainCommChannels1.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1 = domainCommChannels1.size();
		while (i1 > size1)
		{
			domainCommChannels1.remove(i1-1);
			i1 = domainCommChannels1.size();
		}
		
		domainObject.setCommChannels(domainCommChannels1);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientCategory() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientCategory().getID());
		}
		domainObject.setPatientCategory(value2);

		ims.core.clinical.vo.PatientAlertRefVoCollection refCollection3 = valueObject.getPatientAlerts();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainPatientAlerts3 = domainObject.getPatientAlerts();
		if (domainPatientAlerts3 == null)
		{
			domainPatientAlerts3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.clinical.vo.PatientAlertRefVo vo = refCollection3.get(i);					
			ims.core.clinical.domain.objects.PatientAlert dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.PatientAlert)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.PatientAlert)domainFactory.getDomainObject( ims.core.clinical.domain.objects.PatientAlert.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainPatientAlerts3.contains(dom))
			{
				domainPatientAlerts3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainPatientAlerts3.iterator();
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
			domainPatientAlerts3.remove(iter3.next());
		}		
		
		domainObject.setPatientAlerts(domainPatientAlerts3);		
		ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getAssociatedPatient() ) 
		{
			if (valueObject.getAssociatedPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getAssociatedPatient()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getAssociatedPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getAssociatedPatient();	
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getAssociatedPatient().getBoId());
			}
		}
		domainObject.setAssociatedPatient(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value5 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value5);
		ims.framework.utils.Time time6 = valueObject.getTimeOfDeath();
		String value6 = null;
		if ( time6 != null ) 
		{
			value6 = time6.toString();
		}
		domainObject.setTimeOfDeath(value6);
		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSex() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSex().getID());
		}
		domainObject.setSex(value8);
		ims.framework.utils.PartialDate dob = valueObject.getDob();
		Integer value9 = null;
		if ( null != dob ) 
		{
			value9 = dob.toInteger();
		}
		domainObject.setDob(value9);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setIsQuickRegistrationPatient(valueObject.getIsQuickRegistrationPatient());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPrimaryIdValueUsed() != null && valueObject.getPrimaryIdValueUsed().equals(""))
		{
			valueObject.setPrimaryIdValueUsed(null);
		}
		domainObject.setPrimaryIdValueUsed(valueObject.getPrimaryIdValueUsed());
		domainObject.setIdentifiers(ims.core.vo.domain.PatientIdAssembler.extractPatientIdList(domainFactory, valueObject.getIdentifiers(), domainObject.getIdentifiers(), domMap));		
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getDod();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setDod(value14);

		return domainObject;
	}

}
