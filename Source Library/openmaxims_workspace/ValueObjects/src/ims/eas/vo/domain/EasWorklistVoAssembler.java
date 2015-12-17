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
 * @author Bogdan Tofei
 */
public class EasWorklistVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.EasWorklistVo copy(ims.eas.vo.EasWorklistVo valueObjectDest, ims.eas.vo.EasWorklistVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectronicActionSheet(valueObjectSrc.getID_ElectronicActionSheet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// EasStatus
		valueObjectDest.setEasStatus(valueObjectSrc.getEasStatus());
		// ResponsibleHcp
		valueObjectDest.setResponsibleHcp(valueObjectSrc.getResponsibleHcp());
		// TPCreated
		valueObjectDest.setTPCreated(valueObjectSrc.getTPCreated());
		// ActionRequired
		valueObjectDest.setActionRequired(valueObjectSrc.getActionRequired());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// DateSeen
		valueObjectDest.setDateSeen(valueObjectSrc.getDateSeen());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// Intent
		valueObjectDest.setIntent(valueObjectSrc.getIntent());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// PatientStatus
		valueObjectDest.setPatientStatus(valueObjectSrc.getPatientStatus());
		// RemovedStat
		valueObjectDest.setRemovedStat(valueObjectSrc.getRemovedStat());
		// Delayed
		valueObjectDest.setDelayed(valueObjectSrc.getDelayed());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// RemovalReason
		valueObjectDest.setRemovalReason(valueObjectSrc.getRemovalReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEasWorklistVoCollectionFromElectronicActionSheet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.EasWorklistVoCollection createEasWorklistVoCollectionFromElectronicActionSheet(java.util.Set domainObjectSet)	
	{
		return createEasWorklistVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.EasWorklistVoCollection createEasWorklistVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.EasWorklistVoCollection voList = new ims.eas.vo.EasWorklistVoCollection();
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
			ims.eas.vo.EasWorklistVo vo = create(map, domainObject);
			
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
	public static ims.eas.vo.EasWorklistVoCollection createEasWorklistVoCollectionFromElectronicActionSheet(java.util.List domainObjectList) 
	{
		return createEasWorklistVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.EasWorklistVoCollection createEasWorklistVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.EasWorklistVoCollection voList = new ims.eas.vo.EasWorklistVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainObjectList.get(i);
			ims.eas.vo.EasWorklistVo vo = create(map, domainObject);

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
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.EasWorklistVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = EasWorklistVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.EasWorklistVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = EasWorklistVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 public static ims.eas.vo.EasWorklistVo create(ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	  public static ims.eas.vo.EasWorklistVo create(DomainObjectMap map, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.EasWorklistVo valueObject = (ims.eas.vo.EasWorklistVo) map.getValueObject(domainObject, ims.eas.vo.EasWorklistVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.EasWorklistVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.eas.vo.EasWorklistVo insert(ims.eas.vo.EasWorklistVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	 public static ims.eas.vo.EasWorklistVo insert(DomainObjectMap map, ims.eas.vo.EasWorklistVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
		valueObject.setPatient(ims.core.vo.domain.PatientListVoAssembler.create(map, domainObject.getPatient()) );
		// EasStatus
		valueObject.setEasStatus(ims.eas.vo.domain.EasStatusLiteVoAssembler.create(map, domainObject.getEasStatus()) );
		// ResponsibleHcp
		valueObject.setResponsibleHcp(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHcp()) );
		// TPCreated
		valueObject.setTPCreated( domainObject.isTPCreated() );
		// ActionRequired
		valueObject.setActionRequired( domainObject.isActionRequired() );
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
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
		// Intent
		ims.domain.lookups.LookupInstance instance9 = domainObject.getIntent();
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

			ims.ccosched.vo.lookups.TreatmentIntent voLookup9 = new ims.ccosched.vo.lookups.TreatmentIntent(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ccosched.vo.lookups.TreatmentIntent parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ccosched.vo.lookups.TreatmentIntent(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setIntent(voLookup9);
		}
				// Priority
		ims.domain.lookups.LookupInstance instance10 = domainObject.getPriority();
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

			ims.ccosched.vo.lookups.Priority voLookup10 = new ims.ccosched.vo.lookups.Priority(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Priority parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.ccosched.vo.lookups.Priority(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setPriority(voLookup10);
		}
				// PatientStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getPatientStatus();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.ccosched.vo.lookups.Status voLookup11 = new ims.ccosched.vo.lookups.Status(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Status parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.ccosched.vo.lookups.Status(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setPatientStatus(voLookup11);
		}
				// RemovedStat
		valueObject.setRemovedStat( domainObject.isRemovedStat() );
		// Delayed
		valueObject.setDelayed( domainObject.isDelayed() );
		// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourNameVoAssembler.create(map, domainObject.getPrimaryTumour()) );
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.eas.vo.domain.EasStatusLiteVoAssembler.createEasStatusLiteVoCollectionFromEASStatusRecord(map, domainObject.getStatusHistory()) );
		// RemovalReason
		ims.domain.lookups.LookupInstance instance17 = domainObject.getRemovalReason();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.eas.vo.lookups.RemovalReason voLookup17 = new ims.eas.vo.lookups.RemovalReason(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.eas.vo.lookups.RemovalReason parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.eas.vo.lookups.RemovalReason(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setRemovalReason(voLookup17);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVo valueObject) 
	{
		return 	extractElectronicActionSheet(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.EasWorklistVo valueObject, HashMap domMap) 
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
			// ims.eas.vo.EasWorklistVo ID_ElectronicActionSheet field is unknown
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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.domain.objects.EASStatusRecord value2 = null;
		if ( null != valueObject.getEasStatus() ) 
		{
			if (valueObject.getEasStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getEasStatus()) != null)
				{
					value2 = (ims.eas.domain.objects.EASStatusRecord)domMap.get(valueObject.getEasStatus());
				}
			}
			else
			{
				value2 = (ims.eas.domain.objects.EASStatusRecord)domainFactory.getDomainObject(ims.eas.domain.objects.EASStatusRecord.class, valueObject.getEasStatus().getBoId());
			}
		}
		domainObject.setEasStatus(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getResponsibleHcp() ) 
		{
			if (valueObject.getResponsibleHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHcp()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHcp());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHcp().getBoId());
			}
		}
		domainObject.setResponsibleHcp(value3);
		domainObject.setTPCreated(valueObject.getTPCreated());
		domainObject.setActionRequired(valueObject.getActionRequired());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getDateSeen();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setDateSeen(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getDateDecisionToTreat();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setDateDecisionToTreat(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getIntent() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getIntent().getID());
		}
		domainObject.setIntent(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getPatientStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getPatientStatus().getID());
		}
		domainObject.setPatientStatus(value11);
		domainObject.setRemovedStat(valueObject.getRemovedStat());
		domainObject.setDelayed(valueObject.getDelayed());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value14 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value14 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value14 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.TreatmentSites value15 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value15 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value15 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value15);

		// SaveAsRefVO treated as RefValueObject
		ims.eas.vo.EASStatusRecordRefVoCollection refCollection16 = new ims.eas.vo.EASStatusRecordRefVoCollection();
		if (valueObject.getStatusHistory() != null)
		{
			for (int i16=0; i16<valueObject.getStatusHistory().size(); i16++)
			{
				ims.eas.vo.EASStatusRecordRefVo ref16 = (ims.eas.vo.EASStatusRecordRefVo)valueObject.getStatusHistory().get(i16);
				refCollection16.add(ref16);
			}
		}
		int size16 = (null == refCollection16) ? 0 : refCollection16.size();		
		java.util.List domainStatusHistory16 = domainObject.getStatusHistory();
		if (domainStatusHistory16 == null)
		{
			domainStatusHistory16 = new java.util.ArrayList();
		}
		for(int i=0; i < size16; i++) 
		{
			ims.eas.vo.EASStatusRecordRefVo vo = refCollection16.get(i);			
			ims.eas.domain.objects.EASStatusRecord dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.eas.domain.objects.EASStatusRecord)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.eas.domain.objects.EASStatusRecord)domainFactory.getDomainObject( ims.eas.domain.objects.EASStatusRecord.class, vo.getBoId());
				}
			}

			int domIdx = domainStatusHistory16.indexOf(dom);
			if (domIdx == -1)
			{
				domainStatusHistory16.add(i, dom);
			}
			else if (i != domIdx && i < domainStatusHistory16.size())
			{
				Object tmp = domainStatusHistory16.get(i);
				domainStatusHistory16.set(i, domainStatusHistory16.get(domIdx));
				domainStatusHistory16.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i16 = domainStatusHistory16.size();
		while (i16 > size16)
		{
			domainStatusHistory16.remove(i16-1);
			i16 = domainStatusHistory16.size();
		}
		
		domainObject.setStatusHistory(domainStatusHistory16);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getRemovalReason() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getRemovalReason().getID());
		}
		domainObject.setRemovalReason(value17);

		return domainObject;
	}

}
