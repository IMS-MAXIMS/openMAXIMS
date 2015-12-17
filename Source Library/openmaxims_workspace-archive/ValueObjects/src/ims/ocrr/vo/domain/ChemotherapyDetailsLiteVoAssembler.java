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
public class ChemotherapyDetailsLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsLiteVo copy(ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObjectDest, ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemotherapyDetails(valueObjectSrc.getID_ChemotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection();
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
			ims.ocrr.vo.ChemotherapyDetailsLiteVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(java.util.List domainObjectList) 
	{
		return createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection createChemotherapyDetailsLiteVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainObjectList.get(i);
			ims.ocrr.vo.ChemotherapyDetailsLiteVo vo = create(map, domainObject);

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
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsLiteVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsLiteVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.ChemotherapyDetailsLiteVo create(ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	  public static ims.ocrr.vo.ChemotherapyDetailsLiteVo create(DomainObjectMap map, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObject = (ims.ocrr.vo.ChemotherapyDetailsLiteVo) map.getValueObject(domainObject, ims.ocrr.vo.ChemotherapyDetailsLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ChemotherapyDetailsLiteVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.ChemotherapyDetailsLiteVo insert(ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	 public static ims.ocrr.vo.ChemotherapyDetailsLiteVo insert(DomainObjectMap map, ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
		ims.domain.lookups.LookupInstance instance5 = domainObject.getDrugTherapyType();
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

			ims.oncology.vo.lookups.DrugTherapyType voLookup5 = new ims.oncology.vo.lookups.DrugTherapyType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugTherapyType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.DrugTherapyType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setDrugTherapyType(voLookup5);
		}
				// RegimenAcronym
		ims.domain.lookups.LookupInstance instance6 = domainObject.getRegimenAcronym();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RegimenAcronym voLookup6 = new ims.oncology.vo.lookups.RegimenAcronym(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setRegimenAcronym(voLookup6);
		}
				// CancerTreatementIntent
		ims.domain.lookups.LookupInstance instance7 = domainObject.getCancerTreatementIntent();
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

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup7 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setCancerTreatementIntent(voLookup7);
		}
				// TreatmentResponse
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTreatmentResponse();
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

			ims.oncology.vo.lookups.DrugProgramResponse voLookup8 = new ims.oncology.vo.lookups.DrugProgramResponse(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugProgramResponse parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.oncology.vo.lookups.DrugProgramResponse(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTreatmentResponse(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObject) 
	{
		return 	extractChemotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsLiteVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.ChemotherapyDetailsLiteVo ID_ChemotherapyDetails field is unknown
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
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getStartDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setStartDate(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateDecisionToTreat();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateDecisionToTreat(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getDrugTherapyType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getDrugTherapyType().getID());
		}
		domainObject.setDrugTherapyType(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getRegimenAcronym() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getRegimenAcronym().getID());
		}
		domainObject.setRegimenAcronym(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getCancerTreatementIntent() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getCancerTreatementIntent().getID());
		}
		domainObject.setCancerTreatementIntent(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTreatmentResponse() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTreatmentResponse().getID());
		}
		domainObject.setTreatmentResponse(value8);

		return domainObject;
	}

}
