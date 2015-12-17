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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ChemotherapyDetailsShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsShortVo copy(ims.ocrr.vo.ChemotherapyDetailsShortVo valueObjectDest, ims.ocrr.vo.ChemotherapyDetailsShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemotherapyDetails(valueObjectSrc.getID_ChemotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TreatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// TxChangeReason
		valueObjectDest.setTxChangeReason(valueObjectSrc.getTxChangeReason());
		// PreTreatSurfaceArea
		valueObjectDest.setPreTreatSurfaceArea(valueObjectSrc.getPreTreatSurfaceArea());
		// CreatinineClearance
		valueObjectDest.setCreatinineClearance(valueObjectSrc.getCreatinineClearance());
		// HeightValueCM
		valueObjectDest.setHeightValueCM(valueObjectSrc.getHeightValueCM());
		// WeightValueKG
		valueObjectDest.setWeightValueKG(valueObjectSrc.getWeightValueKG());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// DrugTherapyType
		valueObjectDest.setDrugTherapyType(valueObjectSrc.getDrugTherapyType());
		// RegimenAcronym
		valueObjectDest.setRegimenAcronym(valueObjectSrc.getRegimenAcronym());
		// CancerTreatementIntent
		valueObjectDest.setCancerTreatementIntent(valueObjectSrc.getCancerTreatementIntent());
		// TreatmentResponse
		valueObjectDest.setTreatmentResponse(valueObjectSrc.getTreatmentResponse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsShortVoCollection createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsShortVoCollection createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) iterator.next();
			ims.ocrr.vo.ChemotherapyDetailsShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsShortVoCollection createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(java.util.List domainObjectList) 
	{
		return createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsShortVoCollection createChemotherapyDetailsShortVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainObjectList.get(i);
			ims.ocrr.vo.ChemotherapyDetailsShortVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.ChemotherapyDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsShortVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.ChemotherapyDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsShortVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsShortVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.ChemotherapyDetails object.
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsShortVo create(ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.ChemotherapyDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ChemotherapyDetailsShortVo create(DomainObjectMap map, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ChemotherapyDetailsShortVo valueObject = (ims.ocrr.vo.ChemotherapyDetailsShortVo) map.getValueObject(domainObject, ims.ocrr.vo.ChemotherapyDetailsShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ChemotherapyDetailsShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsShortVo insert(ims.ocrr.vo.ChemotherapyDetailsShortVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.ChemotherapyDetails
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsShortVo insert(DomainObjectMap map, ims.ocrr.vo.ChemotherapyDetailsShortVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ChemotherapyDetails(domainObject.getId());
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
			
		// TreatingConsultant
		valueObject.setTreatingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTreatingConsultant()) );
		// TxChangeReason
		ims.domain.lookups.LookupInstance instance2 = domainObject.getTxChangeReason();
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

			ims.oncology.vo.lookups.ChemoTxChangeReason voLookup2 = new ims.oncology.vo.lookups.ChemoTxChangeReason(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.oncology.vo.lookups.ChemoTxChangeReason parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.oncology.vo.lookups.ChemoTxChangeReason(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setTxChangeReason(voLookup2);
		}
				// PreTreatSurfaceArea
		valueObject.setPreTreatSurfaceArea(domainObject.getPreTreatSurfaceArea());
		// CreatinineClearance
		valueObject.setCreatinineClearance(domainObject.getCreatinineClearance());
		// HeightValueCM
		valueObject.setHeightValueCM(domainObject.getHeightValueCM());
		// WeightValueKG
		valueObject.setWeightValueKG(domainObject.getWeightValueKG());
		// Status
		ims.domain.lookups.LookupInstance instance7 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup7 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setStatus(voLookup7);
		}
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
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// DrugTherapyType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getDrugTherapyType();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.DrugTherapyType voLookup12 = new ims.oncology.vo.lookups.DrugTherapyType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugTherapyType parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.oncology.vo.lookups.DrugTherapyType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setDrugTherapyType(voLookup12);
		}
				// RegimenAcronym
		ims.domain.lookups.LookupInstance instance13 = domainObject.getRegimenAcronym();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RegimenAcronym voLookup13 = new ims.oncology.vo.lookups.RegimenAcronym(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setRegimenAcronym(voLookup13);
		}
				// CancerTreatementIntent
		ims.domain.lookups.LookupInstance instance14 = domainObject.getCancerTreatementIntent();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup14 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setCancerTreatementIntent(voLookup14);
		}
				// TreatmentResponse
		ims.domain.lookups.LookupInstance instance15 = domainObject.getTreatmentResponse();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.DrugProgramResponse voLookup15 = new ims.oncology.vo.lookups.DrugProgramResponse(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugProgramResponse parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.oncology.vo.lookups.DrugProgramResponse(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setTreatmentResponse(voLookup15);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVo valueObject) 
	{
		return 	extractChemotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ChemotherapyDetails();
		ims.oncology.domain.objects.ChemotherapyDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.ChemotherapyDetails)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ChemotherapyDetailsShortVo ID_ChemotherapyDetails field is unknown
			domainObject = new ims.oncology.domain.objects.ChemotherapyDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ChemotherapyDetails());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.ChemotherapyDetails)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainFactory.getDomainObject(ims.oncology.domain.objects.ChemotherapyDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ChemotherapyDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getTreatingConsultant() ) 
		{
			if (valueObject.getTreatingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatingConsultant()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTreatingConsultant());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTreatingConsultant().getBoId());
			}
		}
		domainObject.setTreatingConsultant(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getTxChangeReason() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getTxChangeReason().getID());
		}
		domainObject.setTxChangeReason(value2);
		domainObject.setPreTreatSurfaceArea(valueObject.getPreTreatSurfaceArea());
		domainObject.setCreatinineClearance(valueObject.getCreatinineClearance());
		domainObject.setHeightValueCM(valueObject.getHeightValueCM());
		domainObject.setWeightValueKG(valueObject.getWeightValueKG());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value7);
		ims.core.admin.domain.objects.EpisodeOfCare value8 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value8 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value8);
		ims.core.admin.domain.objects.CareContext value9 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value9 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getCareContext();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value9);
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getStartDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setStartDate(value10);
		java.util.Date value11 = null;
		ims.framework.utils.Date date11 = valueObject.getDateDecisionToTreat();		
		if ( date11 != null ) 
		{
			value11 = date11.getDate();
		}
		domainObject.setDateDecisionToTreat(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getDrugTherapyType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getDrugTherapyType().getID());
		}
		domainObject.setDrugTherapyType(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getRegimenAcronym() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getRegimenAcronym().getID());
		}
		domainObject.setRegimenAcronym(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getCancerTreatementIntent() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getCancerTreatementIntent().getID());
		}
		domainObject.setCancerTreatementIntent(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getTreatmentResponse() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getTreatmentResponse().getID());
		}
		domainObject.setTreatmentResponse(value15);

		return domainObject;
	}

}
