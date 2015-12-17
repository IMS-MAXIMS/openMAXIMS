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
package ims.eas.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class DiagnosticImageTransferVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.DiagnosticImageTransferVo copy(ims.eas.vo.DiagnosticImageTransferVo valueObjectDest, ims.eas.vo.DiagnosticImageTransferVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectronicActionSheet(valueObjectSrc.getID_ElectronicActionSheet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// DateSeen
		valueObjectDest.setDateSeen(valueObjectSrc.getDateSeen());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// ImageTransfer
		valueObjectDest.setImageTransfer(valueObjectSrc.getImageTransfer());
		// EASStatus
		valueObjectDest.setEASStatus(valueObjectSrc.getEASStatus());
		// RemovedStat
		valueObjectDest.setRemovedStat(valueObjectSrc.getRemovedStat());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.DiagnosticImageTransferVoCollection createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(java.util.Set domainObjectSet)	
	{
		return createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.DiagnosticImageTransferVoCollection createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.DiagnosticImageTransferVoCollection voList = new ims.eas.vo.DiagnosticImageTransferVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) iterator.next();
			ims.eas.vo.DiagnosticImageTransferVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.DiagnosticImageTransferVoCollection createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(java.util.List domainObjectList) 
	{
		return createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.DiagnosticImageTransferVoCollection createDiagnosticImageTransferVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.DiagnosticImageTransferVoCollection voList = new ims.eas.vo.DiagnosticImageTransferVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainObjectList.get(i);
			ims.eas.vo.DiagnosticImageTransferVo vo = create(map, domainObject);

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
	 * Create the ims.eas.domain.objects.ElectronicActionSheet set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.DiagnosticImageTransferVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = DiagnosticImageTransferVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 * Create the ims.eas.domain.objects.ElectronicActionSheet list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.DiagnosticImageTransferVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = DiagnosticImageTransferVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.eas.domain.objects.ElectronicActionSheet object.
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.DiagnosticImageTransferVo create(ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.eas.domain.objects.ElectronicActionSheet object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.eas.vo.DiagnosticImageTransferVo create(DomainObjectMap map, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.DiagnosticImageTransferVo valueObject = (ims.eas.vo.DiagnosticImageTransferVo) map.getValueObject(domainObject, ims.eas.vo.DiagnosticImageTransferVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.DiagnosticImageTransferVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.DiagnosticImageTransferVo insert(ims.eas.vo.DiagnosticImageTransferVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	 * @param domainObject ims.eas.domain.objects.ElectronicActionSheet
	 */
	 public static ims.eas.vo.DiagnosticImageTransferVo insert(DomainObjectMap map, ims.eas.vo.DiagnosticImageTransferVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectronicActionSheet(domainObject.getId());
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
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// DateSeen
		java.util.Date DateSeen = domainObject.getDateSeen();
		if ( null != DateSeen ) 
		{
			valueObject.setDateSeen(new ims.framework.utils.Date(DateSeen) );
		}
		// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
		// ImageTransfer
		ims.domain.lookups.LookupInstance instance5 = domainObject.getImageTransfer();
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

			ims.core.vo.lookups.YesNo voLookup5 = new ims.core.vo.lookups.YesNo(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNo(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setImageTransfer(voLookup5);
		}
				// EASStatus
		valueObject.setEASStatus(ims.eas.vo.domain.EasStatusLiteVoAssembler.create(map, domainObject.getEasStatus()) );
		// RemovedStat
		valueObject.setRemovedStat( domainObject.isRemovedStat() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVo valueObject) 
	{
		return 	extractElectronicActionSheet(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.DiagnosticImageTransferVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectronicActionSheet();
		ims.eas.domain.objects.ElectronicActionSheet domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.eas.domain.objects.ElectronicActionSheet)domMap.get(valueObject);
			}
			// ims.eas.vo.DiagnosticImageTransferVo ID_ElectronicActionSheet field is unknown
			domainObject = new ims.eas.domain.objects.ElectronicActionSheet();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectronicActionSheet());
			if (domMap.get(key) != null)
			{
				return (ims.eas.domain.objects.ElectronicActionSheet)domMap.get(key);
			}
			domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainFactory.getDomainObject(ims.eas.domain.objects.ElectronicActionSheet.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectronicActionSheet());

	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateSeen();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateSeen(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getDateDecisionToTreat();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setDateDecisionToTreat(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value4 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getImageTransfer() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getImageTransfer().getID());
		}
		domainObject.setImageTransfer(value5);
		domainObject.setEasStatus(ims.eas.vo.domain.EasStatusLiteVoAssembler.extractEASStatusRecord(domainFactory, valueObject.getEASStatus(), domMap));
		domainObject.setRemovedStat(valueObject.getRemovedStat());

		return domainObject;
	}

}
