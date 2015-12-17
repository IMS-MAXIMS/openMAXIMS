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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class ClinicalTrialsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.ClinicalTrialsVo copy(ims.oncology.vo.ClinicalTrialsVo valueObjectDest, ims.oncology.vo.ClinicalTrialsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalTrials(valueObjectSrc.getID_ClinicalTrials());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// ClinicalTrial
		valueObjectDest.setClinicalTrial(valueObjectSrc.getClinicalTrial());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// ExternalProcedure
		valueObjectDest.setExternalProcedure(valueObjectSrc.getExternalProcedure());
		// PlaceOfferedOnTrial
		valueObjectDest.setPlaceOfferedOnTrial(valueObjectSrc.getPlaceOfferedOnTrial());
		// AcceptedTrialOffer
		valueObjectDest.setAcceptedTrialOffer(valueObjectSrc.getAcceptedTrialOffer());
		// ReasonForRejection
		valueObjectDest.setReasonForRejection(valueObjectSrc.getReasonForRejection());
		// sysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalTrialsVoCollectionFromClinicalTrials(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ClinicalTrials objects.
	 */
	public static ims.oncology.vo.ClinicalTrialsVoCollection createClinicalTrialsVoCollectionFromClinicalTrials(java.util.Set domainObjectSet)	
	{
		return createClinicalTrialsVoCollectionFromClinicalTrials(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ClinicalTrials objects.
	 */
	public static ims.oncology.vo.ClinicalTrialsVoCollection createClinicalTrialsVoCollectionFromClinicalTrials(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.ClinicalTrialsVoCollection voList = new ims.oncology.vo.ClinicalTrialsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.ClinicalTrials domainObject = (ims.oncology.domain.objects.ClinicalTrials) iterator.next();
			ims.oncology.vo.ClinicalTrialsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.ClinicalTrials objects.
	 */
	public static ims.oncology.vo.ClinicalTrialsVoCollection createClinicalTrialsVoCollectionFromClinicalTrials(java.util.List domainObjectList) 
	{
		return createClinicalTrialsVoCollectionFromClinicalTrials(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ClinicalTrials objects.
	 */
	public static ims.oncology.vo.ClinicalTrialsVoCollection createClinicalTrialsVoCollectionFromClinicalTrials(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.ClinicalTrialsVoCollection voList = new ims.oncology.vo.ClinicalTrialsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ClinicalTrials domainObject = (ims.oncology.domain.objects.ClinicalTrials) domainObjectList.get(i);
			ims.oncology.vo.ClinicalTrialsVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.ClinicalTrials set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalTrialsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVoCollection voCollection) 
	 {
	 	return extractClinicalTrialsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalTrialsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ClinicalTrialsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ClinicalTrials domainObject = ClinicalTrialsVoAssembler.extractClinicalTrials(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.ClinicalTrials list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalTrialsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVoCollection voCollection) 
	 {
	 	return extractClinicalTrialsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalTrialsList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.ClinicalTrialsVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ClinicalTrials domainObject = ClinicalTrialsVoAssembler.extractClinicalTrials(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.ClinicalTrials object.
	 * @param domainObject ims.oncology.domain.objects.ClinicalTrials
	 */
	 public static ims.oncology.vo.ClinicalTrialsVo create(ims.oncology.domain.objects.ClinicalTrials domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.ClinicalTrials object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.ClinicalTrialsVo create(DomainObjectMap map, ims.oncology.domain.objects.ClinicalTrials domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.ClinicalTrialsVo valueObject = (ims.oncology.vo.ClinicalTrialsVo) map.getValueObject(domainObject, ims.oncology.vo.ClinicalTrialsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.ClinicalTrialsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.ClinicalTrials
	 */
	 public static ims.oncology.vo.ClinicalTrialsVo insert(ims.oncology.vo.ClinicalTrialsVo valueObject, ims.oncology.domain.objects.ClinicalTrials domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.ClinicalTrials
	 */
	 public static ims.oncology.vo.ClinicalTrialsVo insert(DomainObjectMap map, ims.oncology.vo.ClinicalTrialsVo valueObject, ims.oncology.domain.objects.ClinicalTrials domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalTrials(domainObject.getId());
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
			
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
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
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// ClinicalTrial
		ims.domain.lookups.LookupInstance instance4 = domainObject.getClinicalTrial();
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

			ims.oncology.vo.lookups.ClinicalTrialName voLookup4 = new ims.oncology.vo.lookups.ClinicalTrialName(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.ClinicalTrialName parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.ClinicalTrialName(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setClinicalTrial(voLookup4);
		}
				// Procedure
		if (domainObject.getProcedure() != null)
		{
			if(domainObject.getProcedure() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProcedure();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProcedure(new ims.core.clinical.vo.ProcedureRefVo(id, -1));				
			}
			else
			{
				valueObject.setProcedure(new ims.core.clinical.vo.ProcedureRefVo(domainObject.getProcedure().getId(), domainObject.getProcedure().getVersion()));
			}
		}
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// ExternalProcedure
		ims.domain.lookups.LookupInstance instance8 = domainObject.getExternalProcedure();
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

			ims.core.vo.lookups.YesNo voLookup8 = new ims.core.vo.lookups.YesNo(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.YesNo(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setExternalProcedure(voLookup8);
		}
				// PlaceOfferedOnTrial
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPlaceOfferedOnTrial();
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

			ims.core.vo.lookups.YesNo voLookup9 = new ims.core.vo.lookups.YesNo(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.core.vo.lookups.YesNo(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPlaceOfferedOnTrial(voLookup9);
		}
				// AcceptedTrialOffer
		ims.domain.lookups.LookupInstance instance10 = domainObject.getAcceptedTrialOffer();
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

			ims.core.vo.lookups.YesNo voLookup10 = new ims.core.vo.lookups.YesNo(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.core.vo.lookups.YesNo(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setAcceptedTrialOffer(voLookup10);
		}
				// ReasonForRejection
		valueObject.setReasonForRejection(domainObject.getReasonForRejection());
		// sysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ClinicalTrials extractClinicalTrials(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVo valueObject) 
	{
		return 	extractClinicalTrials(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ClinicalTrials extractClinicalTrials(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.ClinicalTrialsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalTrials();
		ims.oncology.domain.objects.ClinicalTrials domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.ClinicalTrials)domMap.get(valueObject);
			}
			// ims.oncology.vo.ClinicalTrialsVo ID_ClinicalTrials field is unknown
			domainObject = new ims.oncology.domain.objects.ClinicalTrials();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalTrials());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.ClinicalTrials)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.ClinicalTrials) domainFactory.getDomainObject(ims.oncology.domain.objects.ClinicalTrials.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalTrials());

		ims.core.admin.domain.objects.EpisodeOfCare value1 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value1);
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
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getClinicalTrial() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getClinicalTrial().getID());
		}
		domainObject.setClinicalTrial(value4);
		ims.core.clinical.domain.objects.Procedure value5 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.Procedure)domMap.get(valueObject.getProcedure());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getProcedure();	
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.Procedure)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Procedure.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getStartDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setStartDate(value6);
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getEndDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setEndDate(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getExternalProcedure() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getExternalProcedure().getID());
		}
		domainObject.setExternalProcedure(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPlaceOfferedOnTrial() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPlaceOfferedOnTrial().getID());
		}
		domainObject.setPlaceOfferedOnTrial(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getAcceptedTrialOffer() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getAcceptedTrialOffer().getID());
		}
		domainObject.setAcceptedTrialOffer(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReasonForRejection() != null && valueObject.getReasonForRejection().equals(""))
		{
			valueObject.setReasonForRejection(null);
		}
		domainObject.setReasonForRejection(valueObject.getReasonForRejection());

		return domainObject;
	}

}
