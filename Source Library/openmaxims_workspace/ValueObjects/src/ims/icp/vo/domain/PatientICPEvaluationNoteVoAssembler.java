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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class PatientICPEvaluationNoteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPEvaluationNoteVo copy(ims.icp.vo.PatientICPEvaluationNoteVo valueObjectDest, ims.icp.vo.PatientICPEvaluationNoteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICPEvaluationNote(valueObjectSrc.getID_PatientICPEvaluationNote());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateTime
		valueObjectDest.setDateTime(valueObjectSrc.getDateTime());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Discipline
		valueObjectDest.setDiscipline(valueObjectSrc.getDiscipline());
		// Note
		valueObjectDest.setNote(valueObjectSrc.getNote());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPEvaluationNote objects.
	 */
	public static ims.icp.vo.PatientICPEvaluationNoteVoCollection createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(java.util.Set domainObjectSet)	
	{
		return createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICPEvaluationNote objects.
	 */
	public static ims.icp.vo.PatientICPEvaluationNoteVoCollection createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPEvaluationNoteVoCollection voList = new ims.icp.vo.PatientICPEvaluationNoteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote) iterator.next();
			ims.icp.vo.PatientICPEvaluationNoteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPEvaluationNote objects.
	 */
	public static ims.icp.vo.PatientICPEvaluationNoteVoCollection createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(java.util.List domainObjectList) 
	{
		return createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICPEvaluationNote objects.
	 */
	public static ims.icp.vo.PatientICPEvaluationNoteVoCollection createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPEvaluationNoteVoCollection voList = new ims.icp.vo.PatientICPEvaluationNoteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote) domainObjectList.get(i);
			ims.icp.vo.PatientICPEvaluationNoteVo vo = create(map, domainObject);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPEvaluationNote set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPEvaluationNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVoCollection voCollection) 
	 {
	 	return extractPatientICPEvaluationNoteSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPEvaluationNoteSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPEvaluationNoteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject = PatientICPEvaluationNoteVoAssembler.extractPatientICPEvaluationNote(domainFactory, vo, domMap);

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
	 * Create the ims.icps.instantiation.domain.objects.PatientICPEvaluationNote list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPEvaluationNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVoCollection voCollection) 
	 {
	 	return extractPatientICPEvaluationNoteList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPEvaluationNoteList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPEvaluationNoteVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject = PatientICPEvaluationNoteVoAssembler.extractPatientICPEvaluationNote(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPEvaluationNote object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPEvaluationNote
	 */
	 public static ims.icp.vo.PatientICPEvaluationNoteVo create(ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICPEvaluationNote object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPEvaluationNoteVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPEvaluationNoteVo valueObject = (ims.icp.vo.PatientICPEvaluationNoteVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPEvaluationNoteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPEvaluationNoteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPEvaluationNote
	 */
	 public static ims.icp.vo.PatientICPEvaluationNoteVo insert(ims.icp.vo.PatientICPEvaluationNoteVo valueObject, ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject) 
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
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICPEvaluationNote
	 */
	 public static ims.icp.vo.PatientICPEvaluationNoteVo insert(DomainObjectMap map, ims.icp.vo.PatientICPEvaluationNoteVo valueObject, ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICPEvaluationNote(domainObject.getId());
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
			
		// DateTime
		java.util.Date DateTime = domainObject.getDateTime();
		if ( null != DateTime ) 
		{
			valueObject.setDateTime(new ims.framework.utils.DateTime(DateTime) );
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Discipline
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDiscipline();
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

			ims.core.vo.lookups.HcpDisType voLookup3 = new ims.core.vo.lookups.HcpDisType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.HcpDisType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDiscipline(voLookup3);
		}
				// Note
		valueObject.setNote(domainObject.getNote());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICPEvaluationNote extractPatientICPEvaluationNote(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVo valueObject) 
	{
		return 	extractPatientICPEvaluationNote(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICPEvaluationNote extractPatientICPEvaluationNote(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPEvaluationNoteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICPEvaluationNote();
		ims.icps.instantiation.domain.objects.PatientICPEvaluationNote domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPEvaluationNoteVo ID_PatientICPEvaluationNote field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICPEvaluationNote();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICPEvaluationNote());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICPEvaluationNote) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICPEvaluationNote.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICPEvaluationNote());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDateTime(value1);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDiscipline() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDiscipline().getID());
		}
		domainObject.setDiscipline(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNote() != null && valueObject.getNote().equals(""))
		{
			valueObject.setNote(null);
		}
		domainObject.setNote(valueObject.getNote());

		return domainObject;
	}

}
