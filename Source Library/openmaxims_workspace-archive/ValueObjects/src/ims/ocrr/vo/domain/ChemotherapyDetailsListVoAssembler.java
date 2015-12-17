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
 * @author Alexie Ursache
 */
public class ChemotherapyDetailsListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ChemotherapyDetailsListVo copy(ims.ocrr.vo.ChemotherapyDetailsListVo valueObjectDest, ims.ocrr.vo.ChemotherapyDetailsListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ChemotherapyDetails(valueObjectSrc.getID_ChemotherapyDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// TreatingConsultant
		valueObjectDest.setTreatingConsultant(valueObjectSrc.getTreatingConsultant());
		// RegimenAcronym
		valueObjectDest.setRegimenAcronym(valueObjectSrc.getRegimenAcronym());
		// CancerTreatementIntent
		valueObjectDest.setCancerTreatementIntent(valueObjectSrc.getCancerTreatementIntent());
		// DateDecisionToTreat
		valueObjectDest.setDateDecisionToTreat(valueObjectSrc.getDateDecisionToTreat());
		// TreatmentResponse
		valueObjectDest.setTreatmentResponse(valueObjectSrc.getTreatmentResponse());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsListVoCollection createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(java.util.Set domainObjectSet)	
	{
		return createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsListVoCollection createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ChemotherapyDetailsListVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsListVoCollection();
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
			ims.ocrr.vo.ChemotherapyDetailsListVo vo = create(map, domainObject);
			
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
	public static ims.ocrr.vo.ChemotherapyDetailsListVoCollection createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(java.util.List domainObjectList) 
	{
		return createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.ChemotherapyDetails objects.
	 */
	public static ims.ocrr.vo.ChemotherapyDetailsListVoCollection createChemotherapyDetailsListVoCollectionFromChemotherapyDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ChemotherapyDetailsListVoCollection voList = new ims.ocrr.vo.ChemotherapyDetailsListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = (ims.oncology.domain.objects.ChemotherapyDetails) domainObjectList.get(i);
			ims.ocrr.vo.ChemotherapyDetailsListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractChemotherapyDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsListVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsListVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVoCollection voCollection) 
	 {
	 	return extractChemotherapyDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractChemotherapyDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ChemotherapyDetailsListVo vo = voCollection.get(i);
			ims.oncology.domain.objects.ChemotherapyDetails domainObject = ChemotherapyDetailsListVoAssembler.extractChemotherapyDetails(domainFactory, vo, domMap);

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
	 public static ims.ocrr.vo.ChemotherapyDetailsListVo create(ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	  public static ims.ocrr.vo.ChemotherapyDetailsListVo create(DomainObjectMap map, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ChemotherapyDetailsListVo valueObject = (ims.ocrr.vo.ChemotherapyDetailsListVo) map.getValueObject(domainObject, ims.ocrr.vo.ChemotherapyDetailsListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ChemotherapyDetailsListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocrr.vo.ChemotherapyDetailsListVo insert(ims.ocrr.vo.ChemotherapyDetailsListVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
	 public static ims.ocrr.vo.ChemotherapyDetailsListVo insert(DomainObjectMap map, ims.ocrr.vo.ChemotherapyDetailsListVo valueObject, ims.oncology.domain.objects.ChemotherapyDetails domainObject) 
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
			
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// TreatingConsultant
		valueObject.setTreatingConsultant(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getTreatingConsultant()) );
		// RegimenAcronym
		ims.domain.lookups.LookupInstance instance3 = domainObject.getRegimenAcronym();
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

			ims.oncology.vo.lookups.RegimenAcronym voLookup3 = new ims.oncology.vo.lookups.RegimenAcronym(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.oncology.vo.lookups.RegimenAcronym parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.oncology.vo.lookups.RegimenAcronym(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setRegimenAcronym(voLookup3);
		}
				// CancerTreatementIntent
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCancerTreatementIntent();
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

			ims.oncology.vo.lookups.CancerTreatmentIntent voLookup4 = new ims.oncology.vo.lookups.CancerTreatmentIntent(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.CancerTreatmentIntent parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.CancerTreatmentIntent(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCancerTreatementIntent(voLookup4);
		}
				// DateDecisionToTreat
		java.util.Date DateDecisionToTreat = domainObject.getDateDecisionToTreat();
		if ( null != DateDecisionToTreat ) 
		{
			valueObject.setDateDecisionToTreat(new ims.framework.utils.Date(DateDecisionToTreat) );
		}
		// TreatmentResponse
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTreatmentResponse();
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

			ims.oncology.vo.lookups.DrugProgramResponse voLookup6 = new ims.oncology.vo.lookups.DrugProgramResponse(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.DrugProgramResponse parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.DrugProgramResponse(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTreatmentResponse(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVo valueObject) 
	{
		return 	extractChemotherapyDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.ChemotherapyDetails extractChemotherapyDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ChemotherapyDetailsListVo valueObject, HashMap domMap) 
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
			// ims.ocrr.vo.ChemotherapyDetailsListVo ID_ChemotherapyDetails field is unknown
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

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getStartDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setStartDate(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value2 = null;
		if ( null != valueObject.getTreatingConsultant() ) 
		{
			if (valueObject.getTreatingConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getTreatingConsultant()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getTreatingConsultant());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getTreatingConsultant().getBoId());
			}
		}
		domainObject.setTreatingConsultant(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getRegimenAcronym() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getRegimenAcronym().getID());
		}
		domainObject.setRegimenAcronym(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCancerTreatementIntent() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCancerTreatementIntent().getID());
		}
		domainObject.setCancerTreatementIntent(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDateDecisionToTreat();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDateDecisionToTreat(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTreatmentResponse() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTreatmentResponse().getID());
		}
		domainObject.setTreatmentResponse(value6);

		return domainObject;
	}

}
