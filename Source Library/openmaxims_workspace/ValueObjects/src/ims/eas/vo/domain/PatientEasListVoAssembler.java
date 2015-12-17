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
public class PatientEasListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.eas.vo.PatientEasListVo copy(ims.eas.vo.PatientEasListVo valueObjectDest, ims.eas.vo.PatientEasListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectronicActionSheet(valueObjectSrc.getID_ElectronicActionSheet());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EasStatus
		valueObjectDest.setEasStatus(valueObjectSrc.getEasStatus());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// ResponsibleHcp
		valueObjectDest.setResponsibleHcp(valueObjectSrc.getResponsibleHcp());
		// DateSeen
		valueObjectDest.setDateSeen(valueObjectSrc.getDateSeen());
		// Intent
		valueObjectDest.setIntent(valueObjectSrc.getIntent());
		// PrimaryTumour
		valueObjectDest.setPrimaryTumour(valueObjectSrc.getPrimaryTumour());
		// TreatmentSite
		valueObjectDest.setTreatmentSite(valueObjectSrc.getTreatmentSite());
		// TPCreated
		valueObjectDest.setTPCreated(valueObjectSrc.getTPCreated());
		// RecordingInfo
		valueObjectDest.setRecordingInfo(valueObjectSrc.getRecordingInfo());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientEasListVoCollectionFromElectronicActionSheet(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.PatientEasListVoCollection createPatientEasListVoCollectionFromElectronicActionSheet(java.util.Set domainObjectSet)	
	{
		return createPatientEasListVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.PatientEasListVoCollection createPatientEasListVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.eas.vo.PatientEasListVoCollection voList = new ims.eas.vo.PatientEasListVoCollection();
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
			ims.eas.vo.PatientEasListVo vo = create(map, domainObject);
			
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
	public static ims.eas.vo.PatientEasListVoCollection createPatientEasListVoCollectionFromElectronicActionSheet(java.util.List domainObjectList) 
	{
		return createPatientEasListVoCollectionFromElectronicActionSheet(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.eas.domain.objects.ElectronicActionSheet objects.
	 */
	public static ims.eas.vo.PatientEasListVoCollection createPatientEasListVoCollectionFromElectronicActionSheet(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.eas.vo.PatientEasListVoCollection voList = new ims.eas.vo.PatientEasListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.eas.domain.objects.ElectronicActionSheet domainObject = (ims.eas.domain.objects.ElectronicActionSheet) domainObjectList.get(i);
			ims.eas.vo.PatientEasListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectronicActionSheetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PatientEasListVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = PatientEasListVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVoCollection voCollection) 
	 {
	 	return extractElectronicActionSheetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectronicActionSheetList(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.eas.vo.PatientEasListVo vo = voCollection.get(i);
			ims.eas.domain.objects.ElectronicActionSheet domainObject = PatientEasListVoAssembler.extractElectronicActionSheet(domainFactory, vo, domMap);

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
	 public static ims.eas.vo.PatientEasListVo create(ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	  public static ims.eas.vo.PatientEasListVo create(DomainObjectMap map, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.eas.vo.PatientEasListVo valueObject = (ims.eas.vo.PatientEasListVo) map.getValueObject(domainObject, ims.eas.vo.PatientEasListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.eas.vo.PatientEasListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.eas.vo.PatientEasListVo insert(ims.eas.vo.PatientEasListVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
	 public static ims.eas.vo.PatientEasListVo insert(DomainObjectMap map, ims.eas.vo.PatientEasListVo valueObject, ims.eas.domain.objects.ElectronicActionSheet domainObject) 
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
			
		// EasStatus
		valueObject.setEasStatus(ims.eas.vo.domain.EasStatusLiteVoAssembler.create(map, domainObject.getEasStatus()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.eas.vo.domain.EasStatusLiteVoAssembler.createEasStatusLiteVoCollectionFromEASStatusRecord(map, domainObject.getStatusHistory()) );
		// ResponsibleHcp
		valueObject.setResponsibleHcp(ims.core.vo.domain.HcpMinVoAssembler.create(map, domainObject.getResponsibleHcp()) );
		// DateSeen
		java.util.Date DateSeen = domainObject.getDateSeen();
		if ( null != DateSeen ) 
		{
			valueObject.setDateSeen(new ims.framework.utils.Date(DateSeen) );
		}
		// Intent
		ims.domain.lookups.LookupInstance instance5 = domainObject.getIntent();
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

			ims.ccosched.vo.lookups.TreatmentIntent voLookup5 = new ims.ccosched.vo.lookups.TreatmentIntent(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ccosched.vo.lookups.TreatmentIntent parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ccosched.vo.lookups.TreatmentIntent(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setIntent(voLookup5);
		}
				// PrimaryTumour
		valueObject.setPrimaryTumour(ims.eas.vo.domain.PrimaryTumourNameVoAssembler.create(map, domainObject.getPrimaryTumour()) );
		// TreatmentSite
		valueObject.setTreatmentSite(ims.eas.vo.domain.TreatmentSiteNameVoAssembler.create(map, domainObject.getTreatmentSite()) );
		// TPCreated
		valueObject.setTPCreated( domainObject.isTPCreated() );
		// RecordingInfo
		valueObject.setRecordingInfo(ims.core.vo.domain.RecordingUserInformationVoAssembler.create(map, domainObject.getRecordingInfo()) );
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVo valueObject) 
	{
		return 	extractElectronicActionSheet(domainFactory, valueObject, new HashMap());
	}

	public static ims.eas.domain.objects.ElectronicActionSheet extractElectronicActionSheet(ims.domain.ILightweightDomainFactory domainFactory, ims.eas.vo.PatientEasListVo valueObject, HashMap domMap) 
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
			// ims.eas.vo.PatientEasListVo ID_ElectronicActionSheet field is unknown
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
	ims.eas.domain.objects.EASStatusRecord value1 = null;
		if ( null != valueObject.getEasStatus() ) 
		{
			if (valueObject.getEasStatus().getBoId() == null)
			{
				if (domMap.get(valueObject.getEasStatus()) != null)
				{
					value1 = (ims.eas.domain.objects.EASStatusRecord)domMap.get(valueObject.getEasStatus());
				}
			}
			else
			{
				value1 = (ims.eas.domain.objects.EASStatusRecord)domainFactory.getDomainObject(ims.eas.domain.objects.EASStatusRecord.class, valueObject.getEasStatus().getBoId());
			}
		}
		domainObject.setEasStatus(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.eas.vo.EASStatusRecordRefVoCollection refCollection2 = new ims.eas.vo.EASStatusRecordRefVoCollection();
		if (valueObject.getStatusHistory() != null)
		{
			for (int i2=0; i2<valueObject.getStatusHistory().size(); i2++)
			{
				ims.eas.vo.EASStatusRecordRefVo ref2 = (ims.eas.vo.EASStatusRecordRefVo)valueObject.getStatusHistory().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainStatusHistory2 = domainObject.getStatusHistory();
		if (domainStatusHistory2 == null)
		{
			domainStatusHistory2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.eas.vo.EASStatusRecordRefVo vo = refCollection2.get(i);			
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

			int domIdx = domainStatusHistory2.indexOf(dom);
			if (domIdx == -1)
			{
				domainStatusHistory2.add(i, dom);
			}
			else if (i != domIdx && i < domainStatusHistory2.size())
			{
				Object tmp = domainStatusHistory2.get(i);
				domainStatusHistory2.set(i, domainStatusHistory2.get(domIdx));
				domainStatusHistory2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainStatusHistory2.size();
		while (i2 > size2)
		{
			domainStatusHistory2.remove(i2-1);
			i2 = domainStatusHistory2.size();
		}
		
		domainObject.setStatusHistory(domainStatusHistory2);		
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
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateSeen();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateSeen(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getIntent() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getIntent().getID());
		}
		domainObject.setIntent(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.PrimaryTumour value6 = null;
		if ( null != valueObject.getPrimaryTumour() ) 
		{
			if (valueObject.getPrimaryTumour().getBoId() == null)
			{
				if (domMap.get(valueObject.getPrimaryTumour()) != null)
				{
					value6 = (ims.eas.configuration.domain.objects.PrimaryTumour)domMap.get(valueObject.getPrimaryTumour());
				}
			}
			else
			{
				value6 = (ims.eas.configuration.domain.objects.PrimaryTumour)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.PrimaryTumour.class, valueObject.getPrimaryTumour().getBoId());
			}
		}
		domainObject.setPrimaryTumour(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.eas.configuration.domain.objects.TreatmentSites value7 = null;
		if ( null != valueObject.getTreatmentSite() ) 
		{
			if (valueObject.getTreatmentSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatmentSite()) != null)
				{
					value7 = (ims.eas.configuration.domain.objects.TreatmentSites)domMap.get(valueObject.getTreatmentSite());
				}
			}
			else
			{
				value7 = (ims.eas.configuration.domain.objects.TreatmentSites)domainFactory.getDomainObject(ims.eas.configuration.domain.objects.TreatmentSites.class, valueObject.getTreatmentSite().getBoId());
			}
		}
		domainObject.setTreatmentSite(value7);
		domainObject.setTPCreated(valueObject.getTPCreated());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.RecordingUserInformation value9 = null;
		if ( null != valueObject.getRecordingInfo() ) 
		{
			if (valueObject.getRecordingInfo().getBoId() == null)
			{
				if (domMap.get(valueObject.getRecordingInfo()) != null)
				{
					value9 = (ims.core.clinical.domain.objects.RecordingUserInformation)domMap.get(valueObject.getRecordingInfo());
				}
			}
			else
			{
				value9 = (ims.core.clinical.domain.objects.RecordingUserInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.RecordingUserInformation.class, valueObject.getRecordingInfo().getBoId());
			}
		}
		domainObject.setRecordingInfo(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value10);

		return domainObject;
	}

}
