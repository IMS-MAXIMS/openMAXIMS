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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PatientAlertLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientAlertLiteVo copy(ims.core.vo.PatientAlertLiteVo valueObjectDest, ims.core.vo.PatientAlertLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientAlert(valueObjectSrc.getID_PatientAlert());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AlertType
		valueObjectDest.setAlertType(valueObjectSrc.getAlertType());
		// isCurrentlyActiveAlert
		valueObjectDest.setIsCurrentlyActiveAlert(valueObjectSrc.getIsCurrentlyActiveAlert());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// DateIdentified
		valueObjectDest.setDateIdentified(valueObjectSrc.getDateIdentified());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientAlertLiteVoCollectionFromPatientAlert(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAlert objects.
	 */
	public static ims.core.vo.PatientAlertLiteVoCollection createPatientAlertLiteVoCollectionFromPatientAlert(java.util.Set domainObjectSet)	
	{
		return createPatientAlertLiteVoCollectionFromPatientAlert(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientAlert objects.
	 */
	public static ims.core.vo.PatientAlertLiteVoCollection createPatientAlertLiteVoCollectionFromPatientAlert(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientAlertLiteVoCollection voList = new ims.core.vo.PatientAlertLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientAlert domainObject = (ims.core.clinical.domain.objects.PatientAlert) iterator.next();
			ims.core.vo.PatientAlertLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAlert objects.
	 */
	public static ims.core.vo.PatientAlertLiteVoCollection createPatientAlertLiteVoCollectionFromPatientAlert(java.util.List domainObjectList) 
	{
		return createPatientAlertLiteVoCollectionFromPatientAlert(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientAlert objects.
	 */
	public static ims.core.vo.PatientAlertLiteVoCollection createPatientAlertLiteVoCollectionFromPatientAlert(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientAlertLiteVoCollection voList = new ims.core.vo.PatientAlertLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientAlert domainObject = (ims.core.clinical.domain.objects.PatientAlert) domainObjectList.get(i);
			ims.core.vo.PatientAlertLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientAlert set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientAlertSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVoCollection voCollection) 
	 {
	 	return extractPatientAlertSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientAlertSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAlertLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAlert domainObject = PatientAlertLiteVoAssembler.extractPatientAlert(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientAlert list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientAlertList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVoCollection voCollection) 
	 {
	 	return extractPatientAlertList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientAlertList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientAlertLiteVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientAlert domainObject = PatientAlertLiteVoAssembler.extractPatientAlert(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAlert object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientAlert
	 */
	 public static ims.core.vo.PatientAlertLiteVo create(ims.core.clinical.domain.objects.PatientAlert domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientAlert object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientAlertLiteVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientAlert domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientAlertLiteVo valueObject = (ims.core.vo.PatientAlertLiteVo) map.getValueObject(domainObject, ims.core.vo.PatientAlertLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientAlertLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientAlert
	 */
	 public static ims.core.vo.PatientAlertLiteVo insert(ims.core.vo.PatientAlertLiteVo valueObject, ims.core.clinical.domain.objects.PatientAlert domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientAlert
	 */
	 public static ims.core.vo.PatientAlertLiteVo insert(DomainObjectMap map, ims.core.vo.PatientAlertLiteVo valueObject, ims.core.clinical.domain.objects.PatientAlert domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientAlert(domainObject.getId());
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
			
		// AlertType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getAlertType();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.AlertType voLookup1 = new ims.core.vo.lookups.AlertType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.AlertType parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.AlertType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setAlertType(voLookup1);
		}
				// isCurrentlyActiveAlert
		valueObject.setIsCurrentlyActiveAlert( domainObject.isIsCurrentlyActiveAlert() );
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSourceofInformation();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup3 = new ims.core.vo.lookups.SourceofInformation(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.SourceofInformation(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSourceofInformation(voLookup3);
		}
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
		// Comments
		valueObject.setComments(domainObject.getComments());
		// DateIdentified
		Integer DateIdentified = domainObject.getDateIdentified();
		if ( null != DateIdentified ) 
		{
			valueObject.setDateIdentified(new ims.framework.utils.PartialDate(DateIdentified) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientAlert extractPatientAlert(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVo valueObject) 
	{
		return 	extractPatientAlert(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientAlert extractPatientAlert(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientAlertLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientAlert();
		ims.core.clinical.domain.objects.PatientAlert domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAlert)domMap.get(valueObject);
			}
			// ims.core.vo.PatientAlertLiteVo ID_PatientAlert field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientAlert();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientAlert());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientAlert)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientAlert) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientAlert.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientAlert());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getAlertType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getAlertType().getID());
		}
		domainObject.setAlertType(value1);
		domainObject.setIsCurrentlyActiveAlert(valueObject.getIsCurrentlyActiveAlert());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value3);
		ims.core.patient.domain.objects.Patient value4 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value4 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getPatient();	
			}
			else
			{
				value4 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.framework.utils.PartialDate DateIdentified = valueObject.getDateIdentified();
		Integer value6 = null;
		if ( null != DateIdentified ) 
		{
			value6 = DateIdentified.toInteger();
		}
		domainObject.setDateIdentified(value6);

		return domainObject;
	}

}
