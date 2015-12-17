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
public class PatientCaseNoteTransferVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientCaseNoteTransferVo copy(ims.core.vo.PatientCaseNoteTransferVo valueObjectDest, ims.core.vo.PatientCaseNoteTransferVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientCaseNoteTransfer(valueObjectSrc.getID_PatientCaseNoteTransfer());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CaseNote
		valueObjectDest.setCaseNote(valueObjectSrc.getCaseNote());
		// TransferredFromLocation
		valueObjectDest.setTransferredFromLocation(valueObjectSrc.getTransferredFromLocation());
		// TransferredToLocation
		valueObjectDest.setTransferredToLocation(valueObjectSrc.getTransferredToLocation());
		// TransferredBy
		valueObjectDest.setTransferredBy(valueObjectSrc.getTransferredBy());
		// TransferDate
		valueObjectDest.setTransferDate(valueObjectSrc.getTransferDate());
		// ReasonForTransfer
		valueObjectDest.setReasonForTransfer(valueObjectSrc.getReasonForTransfer());
		// TansferComment
		valueObjectDest.setTansferComment(valueObjectSrc.getTansferComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferVoCollection createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(java.util.Set domainObjectSet)	
	{
		return createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferVoCollection createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientCaseNoteTransferVoCollection voList = new ims.core.vo.PatientCaseNoteTransferVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) iterator.next();
			ims.core.vo.PatientCaseNoteTransferVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferVoCollection createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(java.util.List domainObjectList) 
	{
		return createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientCaseNoteTransfer objects.
	 */
	public static ims.core.vo.PatientCaseNoteTransferVoCollection createPatientCaseNoteTransferVoCollectionFromPatientCaseNoteTransfer(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientCaseNoteTransferVoCollection voList = new ims.core.vo.PatientCaseNoteTransferVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) domainObjectList.get(i);
			ims.core.vo.PatientCaseNoteTransferVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteTransfer set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientCaseNoteTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteTransferSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientCaseNoteTransferSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = PatientCaseNoteTransferVoAssembler.extractPatientCaseNoteTransfer(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.PatientCaseNoteTransfer list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientCaseNoteTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVoCollection voCollection) 
	 {
	 	return extractPatientCaseNoteTransferList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientCaseNoteTransferList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientCaseNoteTransferVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = PatientCaseNoteTransferVoAssembler.extractPatientCaseNoteTransfer(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteTransfer object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferVo create(ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientCaseNoteTransfer object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientCaseNoteTransferVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientCaseNoteTransferVo valueObject = (ims.core.vo.PatientCaseNoteTransferVo) map.getValueObject(domainObject, ims.core.vo.PatientCaseNoteTransferVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientCaseNoteTransferVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferVo insert(ims.core.vo.PatientCaseNoteTransferVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.PatientCaseNoteTransfer
	 */
	 public static ims.core.vo.PatientCaseNoteTransferVo insert(DomainObjectMap map, ims.core.vo.PatientCaseNoteTransferVo valueObject, ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientCaseNoteTransfer(domainObject.getId());
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
		// CaseNote
		if (domainObject.getCaseNote() != null)
		{
			if(domainObject.getCaseNote() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCaseNote();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCaseNote(new ims.core.clinical.vo.PatientCaseNoteRefVo(id, -1));				
			}
			else
			{
				valueObject.setCaseNote(new ims.core.clinical.vo.PatientCaseNoteRefVo(domainObject.getCaseNote().getId(), domainObject.getCaseNote().getVersion()));
			}
		}
		// TransferredFromLocation
		if (domainObject.getTransferredFromLocation() != null)
		{
			if(domainObject.getTransferredFromLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTransferredFromLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTransferredFromLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setTransferredFromLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getTransferredFromLocation().getId(), domainObject.getTransferredFromLocation().getVersion()));
			}
		}
		// TransferredToLocation
		if (domainObject.getTransferredToLocation() != null)
		{
			if(domainObject.getTransferredToLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTransferredToLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTransferredToLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setTransferredToLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getTransferredToLocation().getId(), domainObject.getTransferredToLocation().getVersion()));
			}
		}
		// TransferredBy
		if (domainObject.getTransferredBy() != null)
		{
			if(domainObject.getTransferredBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTransferredBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTransferredBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setTransferredBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getTransferredBy().getId(), domainObject.getTransferredBy().getVersion()));
			}
		}
		// TransferDate
		java.util.Date TransferDate = domainObject.getTransferDate();
		if ( null != TransferDate ) 
		{
			valueObject.setTransferDate(new ims.framework.utils.DateTime(TransferDate) );
		}
		// ReasonForTransfer
		ims.domain.lookups.LookupInstance instance7 = domainObject.getReasonForTransfer();
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

			ims.core.vo.lookups.CaseNoteReasonForRequest voLookup7 = new ims.core.vo.lookups.CaseNoteReasonForRequest(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.CaseNoteReasonForRequest parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.CaseNoteReasonForRequest(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setReasonForTransfer(voLookup7);
		}
				// TansferComment
		valueObject.setTansferComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.create(map, domainObject.getTansferComment()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientCaseNoteTransfer extractPatientCaseNoteTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVo valueObject) 
	{
		return 	extractPatientCaseNoteTransfer(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientCaseNoteTransfer extractPatientCaseNoteTransfer(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientCaseNoteTransferVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientCaseNoteTransfer();
		ims.core.clinical.domain.objects.PatientCaseNoteTransfer domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domMap.get(valueObject);
			}
			// ims.core.vo.PatientCaseNoteTransferVo ID_PatientCaseNoteTransfer field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientCaseNoteTransfer();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientCaseNoteTransfer());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientCaseNoteTransfer)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientCaseNoteTransfer) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNoteTransfer.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientCaseNoteTransfer());

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
		ims.core.clinical.domain.objects.PatientCaseNote value2 = null;
		if ( null != valueObject.getCaseNote() ) 
		{
			if (valueObject.getCaseNote().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNote()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientCaseNote)domMap.get(valueObject.getCaseNote());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCaseNote();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientCaseNote)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientCaseNote.class, valueObject.getCaseNote().getBoId());
			}
		}
		domainObject.setCaseNote(value2);
		ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getTransferredFromLocation() ) 
		{
			if (valueObject.getTransferredFromLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredFromLocation()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferredFromLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getTransferredFromLocation();	
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferredFromLocation().getBoId());
			}
		}
		domainObject.setTransferredFromLocation(value3);
		ims.core.resource.place.domain.objects.Location value4 = null;
		if ( null != valueObject.getTransferredToLocation() ) 
		{
			if (valueObject.getTransferredToLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredToLocation()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getTransferredToLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getTransferredToLocation();	
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getTransferredToLocation().getBoId());
			}
		}
		domainObject.setTransferredToLocation(value4);
		ims.core.resource.people.domain.objects.MemberOfStaff value5 = null;
		if ( null != valueObject.getTransferredBy() ) 
		{
			if (valueObject.getTransferredBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getTransferredBy()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getTransferredBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getTransferredBy();	
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getTransferredBy().getBoId());
			}
		}
		domainObject.setTransferredBy(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getTransferDate();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setTransferDate(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getReasonForTransfer() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getReasonForTransfer().getID());
		}
		domainObject.setReasonForTransfer(value7);
		domainObject.setTansferComment(ims.core.vo.domain.PatientCaseNoteCommentSaveVoAssembler.extractPatientCaseNoteComment(domainFactory, valueObject.getTansferComment(), domMap));

		return domainObject;
	}

}
